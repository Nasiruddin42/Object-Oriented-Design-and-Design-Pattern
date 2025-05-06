public class ChainOfResponsibilty {
    public static void main(String[] args) {
        Approver cashier = new Cashier() ;
        Approver seniorOfficer = new SeniorOfficer() ;
        Approver manager = new Manager() ;

        cashier.setNextApprover(seniorOfficer);
        seniorOfficer.setNextApprover(manager);

        WithdrawalRequest request1 = new WithdrawalRequest(500) ;
        WithdrawalRequest request2 = new WithdrawalRequest(12000) ;
        WithdrawalRequest request3 = new WithdrawalRequest(100000) ;

        processWithdrawal(cashier, request1);
        processWithdrawal(cashier, request2);
        processWithdrawal(cashier, request3);


    }

    private static void processWithdrawal(Approver approver, WithdrawalRequest request){
        System.out.println("\nRequesting withdrawal amount of Tk. " + request.getAmount());
        approver.handleRequest(request);
    }
}

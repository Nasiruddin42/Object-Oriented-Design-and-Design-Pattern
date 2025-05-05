interface Approver {
    void handleRequest(WithdrawalRequest request) ;
    void setNextApprover(Approver nextApprover) ;
}

class Cashier implements Approver{
    private Approver nextApprover ;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover ;
    }

    public void handleRequest(WithdrawalRequest request){
        if(request.getAmount() <= 10000){
            System.out.println("Cashier:  aproved to the Tk. " + request.getAmount());
        }
        else if(nextApprover != null){
            System.out.println("Cashier forward to senior officer");
            nextApprover.handleRequest(request);
        }
    }
}

class SeniorOfficer implements Approver{
    private Approver nextApprover ;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover ;
    }

    public void handleRequest(WithdrawalRequest request){
        if(request.getAmount() > 10000 && request.getAmount() <= 100000){
            System.out.println("Senior officer: Approved the amount of Tk. " + request.getAmount());
        }
        else if(nextApprover != null){
            System.out.println("Senior officer forward to manager");
            nextApprover.handleRequest(request);
        }
    }
}

class Manager implements Approver{
    public void setNextApprover(Approver nextApprover){
        // no need 
    }

    public void handleRequest(WithdrawalRequest request){
        if(request.getAmount() > 100000){
            System.out.println("Manager: Approved the amount of Tk. " + request.getAmount());
        }
        else{
            System.out.println("This request does not my approval");
        }
    }
}

class WithdrawalRequest{
    private int amount ;

    public WithdrawalRequest(int amount){
        this.amount = amount ;
    }
    public int getAmount(){
        return amount ;
    }
}

public class ChainOfResponsibilty {
    public static void main(String[] args) {
        Approver cashier = new Cashier() ;
        Approver seniorOfficer = new SeniorOfficer() ;
        Approver manager = new Manager() ;

        cashier.setNextApprover(seniorOfficer);
        seniorOfficer.setNextApprover(manager);

        WithdrawalRequest request1 = new WithdrawalRequest(500);
        WithdrawalRequest request2 = new WithdrawalRequest(15000) ;
        WithdrawalRequest request3 = new WithdrawalRequest(300000) ;

        processWithdrawal(cashier, request1);
        processWithdrawal(cashier, request2);
        processWithdrawal(cashier, request3);
    }

    private static void processWithdrawal(Approver approver, WithdrawalRequest request){
        System.out.println("\nRequesting withdraw amount of Tk. " + request.getAmount());
        approver.handleRequest(request);
    }
}
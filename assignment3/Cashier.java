

public class Cashier implements Approver {
    private Approver nextApprover ;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover ;
    }

    public void handleRequest(WithdrawalRequest request){
        if(request.getAmount() <= 10000){
            System.out.println("Cashier : approved to the Tk. : " + request.getAmount());
        }
        else if(nextApprover != null){
            System.out.println("Cashier forward to senior officer");
            nextApprover.handleRequest(request);
        }
    }
}

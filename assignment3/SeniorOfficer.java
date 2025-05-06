

public class SeniorOfficer implements Approver {
    private Approver nextApprover ;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover ;
    }

    public void handleRequest(WithdrawalRequest request){
        if(request.getAmount() > 10000 && request.getAmount() < 100000){
            System.out.println("Senior Officer : approved to the Tk. : " + request.getAmount());
        }
        else if(nextApprover != null){
            System.out.println("Senior officer forward to manager");
            nextApprover.handleRequest(request);
        }
    }
}

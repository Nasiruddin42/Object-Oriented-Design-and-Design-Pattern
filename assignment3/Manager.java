
public class Manager implements Approver {

    public void setNextApprover(Approver nextApprover){
        // no need
    }

    public void handleRequest(WithdrawalRequest request){
        if(request.getAmount() > 100000){
            System.out.println("Manager : approved to the Tk. " + request.getAmount());
        }
        else{
            System.out.println("This request doesn't my approvel");
        }
    }
}

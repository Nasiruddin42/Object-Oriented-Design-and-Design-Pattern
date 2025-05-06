
public interface Approver {
    void handleRequest(WithdrawalRequest request);
    void setNextApprover(Approver nextApprover) ;
}

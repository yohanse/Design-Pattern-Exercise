package templete;

public class TransferMoneyTask extends Task {

    public TransferMoneyTask(AuditRecord auditRecord) {
        super(auditRecord);
    }

    @Override
    protected void doExecute() {
        System.out.println("Execute Transfer Money Task !!");
    }

}

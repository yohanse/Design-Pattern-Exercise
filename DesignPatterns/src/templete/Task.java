package templete;

public abstract class Task {
    private AuditRecord auditRecord;

    public Task(AuditRecord auditRecord) {
        this.auditRecord = auditRecord;
    }

    public void execute(){
        auditRecord.record();
        doExecute();
    }

    protected abstract void doExecute();
}

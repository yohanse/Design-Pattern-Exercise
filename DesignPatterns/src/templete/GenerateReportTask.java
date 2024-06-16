package templete;

public class GenerateReportTask extends Task{

    public GenerateReportTask(AuditRecord auditRecord){
        super(auditRecord);
    }

    @Override
    protected void doExecute() {
        System.out.println("Excute Generate Report Task");
    }
}

package templete;

public class TaskExecutor {
    private Task currentTask;

    public TaskExecutor(Task task) {
        currentTask = task;
    }

    public void setCurrentTask(Task task){
        currentTask = task;
    }

    public Task getCurrenTask() {
        return currentTask;
    }

    public void execute() {
        currentTask.execute();
    }
}

package cs171.sum2023.lab8.TaskManager;
class Task {
    String taskName;
    Task next;

    public Task(String taskName) {
        this.taskName = taskName;
        this.next = null;
    }
}

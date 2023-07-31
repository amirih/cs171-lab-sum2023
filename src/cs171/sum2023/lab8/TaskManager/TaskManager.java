package cs171.sum2023.lab8.TaskManager;

public class TaskManager {
    private Task head;

    public TaskManager() {
        this.head = null;
    }

    // Add a new task to the end of the linked list
    public void addTask(String taskName) {
        Task newTask = new Task(taskName);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
    }

    // Remove a task with the given name from the linked list
    public void removeTask(String taskName) {

    }

    // Display all tasks in the linked list
    public void displayTasks() {

    }

    public static void main(String[] args) {
        TaskManagerSolution taskManager = new TaskManagerSolution();

        // Adding tasks
        taskManager.addTask("Complete project report");
        taskManager.addTask("Buy groceries");
        taskManager.addTask("Call a friend");

        // Displaying tasks
        taskManager.displayTasks();

        // Removing a task
        taskManager.removeTask("Buy groceries");

        // Displaying tasks after removal
        taskManager.displayTasks();
    }
}

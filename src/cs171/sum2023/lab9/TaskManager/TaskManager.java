package cs171.sum2023.lab9.TaskManager;

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

    // Method to sort the list using Merge Sort
    public void sortTasks() {
        if (head == null || head.next == null) {
            return;
        }

        head = mergeSort(head);
    }

    private Task mergeSort(Task head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // split the list into two halves
        Task temp = head;
        Task slow = head;
        Task fast = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null; // cut off the first half

        // recursively sort the two halves
        Task left_side = mergeSort(head);
        Task right_side = mergeSort(slow);

        // merge the sorted halves
        return merge(left_side, right_side);
    }

    private Task merge(Task a, Task b) {
        Task result = null;

        // base cases


        // pick either a or b and recur

        return result;
    }

    public void reverseTasks() {

    }

    public static void main(String[] args) {
        TaskManagerSolution taskManager = new TaskManagerSolution();

        // Adding tasks
        taskManager.addTask("Complete project report");
        taskManager.addTask("Buy groceries");
        taskManager.addTask("Call a friend");

        taskManager.displayTasks();
        taskManager.sortTasks();
        // Displaying tasks
        taskManager.displayTasks();

        // Removing a task
        taskManager.removeTask("Buy groceries");

        // Displaying tasks after removal
        taskManager.displayTasks();
    }
}

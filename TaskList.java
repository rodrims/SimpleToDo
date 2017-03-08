import java.util.ArrayList;

/*
 * A class representing a list of tasks.
 * @author Rodrigo Mejia
 * @version 1
 */
public class TaskList {
    private String name;
    private ArrayList<Task> tasks;

    /*
     * Constructor for a task list list.
     *
     * @param name the list's name
     * @param tasks the list's tasks
     */
    public TaskList(String name, ArrayList<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    /*
     * Constructor for a task list.
     *
     * @param name the list's name
     */
    public TaskList(String name) {
		this.name = name;
    }

    /*
     * Constructor for a task list.
     */
    public TaskList() {
        this("New List");
    }

    /*
     * @return the task list's name
     */
    public String getName() {
        return this.name;
    }

    /*
     * @return the task list's tasks
     */
    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    /*
     * @param name the task list's new name
     */
    public void setName(String name) {
        this.name = name;
    }

	/*
	 * @param task the new task to be added
	 */
	public void addTask(Task task) {
		tasks.add(task);
	}
}

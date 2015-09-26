import java.util.ArrayList;

/*
 * Main class of the SimpleToDo program.
 * @author Rodrigo Mejia
 * @version 1
 */
public class SimpleToDo {
    private String name;
    private ArrayList tasks;

    /*
     * Constructor for a simple to do list.
     *
     * @param name the list's name
     * @param tasks the list's tasks
     */
    public SimpleToDo(String name, Task[] tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    /*
     * Constructor for a simple to do list.
     *
     * @param name the list's name
     */
    public SimpleToDo(String name) {
        this(name, null);
    }

    /*
     * Constructor for a simple to do list.
     */
    public SimpleToDo() {
        this("New List", null);
    }

    /*
     * @return the simple to do list's name
     */
    public String getName() {
        return this.name;
    }

    /*
     * @return the simple to do list's tasks
     */
    public Task[] getTasks() {
        return this.tasks;
    }

    /*
     * @param name the simple to do list's new name
     */
    public void setName(String name) {
        this.name = name;
    }
}

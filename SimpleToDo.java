/*
 * Main class of the SimpleToDo program.
 * @author Rodrigo Mejia
 * @version 1
 */
public class SimpleToDo {
    private String name = "New List";
    private ArrayList tasks;

    public SimpleToDo(String name) {
        this.name = name;
    }

    public SimpleToDo(String name, Task[] tasks) {
        this.name = name;
        this.tasks = tasks;
    }
}

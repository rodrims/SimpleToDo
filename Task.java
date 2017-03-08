/*
 * Class representing a task in a to-do list.
 *
 * @author Rodrigo Mejia
 * @version 1
 */
public class Task {
    String title;
    String body;

    /*
     * Constructor for a task.
     *
     * @param title the task's title
     * @param body the task's body
     */
    public Task(String title, String body) {
        this.title = title;
        this.body = body;
    }

    /*
     * Constructor for a task.
     *
     * @param title the task's title
     */
    public Task(String title) {
        this(title, null);
    }

    /*
     * @return the task's title
     */
    public String getTitle() {
        return this.title;
    }

    /*
     * @return the task's body
     */
    public String getNote() {
        return this.body;
    }

    /*
     * @param title the task's title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     * @param body the task's body
     */
    public void setNote(String body) {
        this.body = body;
    }
}

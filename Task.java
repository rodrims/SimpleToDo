/*
 * Class representing a task in a to-do list.
 *
 * @author Rodrigo Mejia
 * @version 1
 */
public class Task {
    String title;
    String note;

    /*
     * Constructor for a task.
     *
     * @param title the task's title
     * @param note the task's note
     */
    public Task(String title, String note) {
        this.title = title;
        this.note = note;
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
     * @return the task's note
     */
    public String getNote() {
        return this.note;
    }

    /*
     * @param title the task's title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     * @param note the task's note
     */
    public void setNote(String note) {
        this.note = note;
    }
}

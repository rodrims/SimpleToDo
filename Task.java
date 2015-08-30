/*
 * Class representing a task in a to-do list.
 * @author Rodrigo Mejia
 * @version 1
 */
public class Task {
    String title = "";
    String note = "";

    public Task(String title, String note) {
        this.title = title;
        this.note = note;
    }

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getNote() {
        return this.note;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

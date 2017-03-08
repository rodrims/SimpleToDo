import javafx.stage.Stage;
import javafx.application.Application; 
import javafx.scene.Scene;

public class ToDo extends Application {
	private TaskList taskList = new TaskList("New List");

	public static void main(Stringp[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Simple To Do");
	}
}

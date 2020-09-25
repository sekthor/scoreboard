import controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;
import view.ScoreboardView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ScoreboardView view = new ScoreboardView(primaryStage);
        Controller controller = new Controller(view);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

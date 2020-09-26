package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ScoreboardView {

    Button update;
    TextField team1Name;
    TextField team2Name;
    TextField team1Score;
    TextField team2Score;

    public ScoreboardView(Stage stage) {

        // make Labels
        Label team1 = new Label("Home");
        Label team2 = new Label("Visitor");
        Label name = new Label("Name");
        Label score = new Label("Score");

        // make textfields and update button
        this.team1Name = new TextField();
        this.team2Name = new TextField();
        this.team1Score = new TextField();
        this.team2Score = new TextField();
        this.update = new Button("update");


        // create an fill main pane
        GridPane main = new GridPane();
        main.add(team1,0,0);
        main.add(team2, 2,0);
        main.add(name, 1,1);
        main.add(team1Name,0,2);
        main.add(team2Name, 2,2);
        main.add(score, 1,3);
        main.add(team1Score,0,4);
        main.add(team2Score, 2,4);
        main.add(update, 1,10);


        // set scene to stage
        Scene scene = new Scene(main);
        stage.setScene(scene);
        stage.show();
    }

    public String getHomeName() {
        return this.team1Name.getText();
    }

    public String getVisitorName() {
        return this.team2Name.getText();
    }

    public String getHomeScore() {
        return this.team1Score.getText();
    }

    public String getVisitorScore() {
        return this.team2Score.getText();
    }

    public Button getUpdate() {
        return update;
    }
}

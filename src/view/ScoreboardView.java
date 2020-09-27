package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ScoreboardView {

    private Button update;
    private Button try1;
    private Button try2;
    private Button conv1;
    private Button conv2;
    private Button pen1;
    private Button pen2;
    private TextField team1Name;
    private TextField team2Name;
    private TextField team1Score;
    private TextField team2Score;

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
        this.try1 = new Button("Try");
        this.try2 = new Button("Try");
        this.conv1 = new Button("Conversion");
        this.conv2 = new Button("Conversion");
        this.pen1 = new Button("Penalty");
        this.pen2 = new Button("Penalty");
        this.update = new Button("update");


        // create an fill main pane
        GridPane main = new GridPane();
        main.add(team1,0,0);
        main.add(team2, 4,0);
        main.add(name, 3,1);
        main.add(score, 3,3);

        main.add(team1Name,0,2,3,1);
        main.add(team2Name, 4,2,3,1);
        main.add(team1Score,0,4,3,1);
        main.add(team2Score, 4,4,3,1);

        main.add(try1, 0,5);
        main.add(try2, 4,5);
        main.add(pen1, 1,5);
        main.add(pen2, 5,5);
        main.add(conv1, 2,5);
        main.add(conv2, 6,5);


        main.add(update, 3,10);


        // set scene to stage
        Scene scene = new Scene(main);
        stage.setScene(scene);
        stage.show();
    }

    public Button getTry1() {
        return try1;
    }

    public Button getTry2() {
        return try2;
    }

    public Button getConv1() {
        return conv1;
    }

    public Button getConv2() {
        return conv2;
    }

    public Button getPen1() {
        return pen1;
    }

    public Button getPen2() {
        return pen2;
    }

    public void setHomeScore(String score) {
        this.team1Score.setText(score);
    }

    public void setVisitorScore(String score) {
        this.team2Score.setText(score);
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

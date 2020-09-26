package controller;


import view.ScoreboardView;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {


    // call update() when update button is pressed
    public Controller(ScoreboardView view) {
        view.getUpdate().setOnAction(event -> update(view));
    }

    //
    private void update(ScoreboardView view) {
        writeStringToFile(view.getHomeName(), "home.txt");
        writeStringToFile(view.getVisitorName(), "visitor.txt");
        writeStringToFile(view.getHomeScore(), "home-score.txt");
        writeStringToFile(view.getVisitorScore(), "visitor-score.txt");
    }

    public void writeStringToFile(String string, String file) {
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(string);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

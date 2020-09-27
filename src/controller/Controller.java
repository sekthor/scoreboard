package controller;


import view.ScoreboardView;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {


    // call update() when update button is pressed
    public Controller(ScoreboardView view) {
        view.getUpdate().setOnAction(event -> update(view));

        view.getTry1().setOnAction(event ->
                view.setHomeScore(add(view.getHomeScore(),5)));

        view.getTry2().setOnAction(event ->
                view.setVisitorScore(add(view.getVisitorScore(),5)));

        view.getConv1().setOnAction( event ->
                view.setHomeScore(add(view.getHomeScore(), 2)));

        view.getConv2().setOnAction( event ->
                view.setVisitorScore(add(view.getVisitorScore(), 2)));

        view.getPen1().setOnAction( event ->
                view.setHomeScore(add(view.getHomeScore(), 3)));

        view.getPen2().setOnAction( event ->
                view.setVisitorScore(add(view.getVisitorScore(), 3)));
    }

    private String add(String current, int score) {
        Integer i = new Integer(current);
        return Integer.toString(i + score);
    }

    // updates each file with current text from corresponding Text field
    private void update(ScoreboardView view) {
        writeStringToFile(view.getHomeName(), "home.txt");
        writeStringToFile(view.getVisitorName(), "visitor.txt");
        writeStringToFile(view.getHomeScore(), "home-score.txt");
        writeStringToFile(view.getVisitorScore(), "visitor-score.txt");
    }

    // overwrites contents of "file" with current "string"
    private void writeStringToFile(String string, String file) {
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(string);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

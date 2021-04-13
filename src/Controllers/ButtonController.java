package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class ButtonController {
    private final Circle circle;
    private double x;
    private double y;

    //Constructor
    ButtonController(Circle circle) {
        this.circle = circle;
    }

    public void up(ActionEvent e) {
        circle.setCenterY(y-=10);
    }
    public void down(ActionEvent e) {
        circle.setCenterY(y+=10);
    }
    public void right(ActionEvent e) {
        circle.setCenterX(x-=10);
    }
    public void left(ActionEvent e) {
        circle.setCenterX(x-=10);
    }
}

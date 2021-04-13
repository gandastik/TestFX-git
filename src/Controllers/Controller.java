package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Circle circle;
    private double x;
    private double y;

   public void up(ActionEvent e) {
        circle.setCenterY(y-=50);
   }
    public void down(ActionEvent e) {
        circle.setCenterY(y+=50);
    }
    public void left(ActionEvent e) {
        circle.setCenterX(x-=50);
    }
    public void right(ActionEvent e) {
        circle.setCenterX(x+=50);
    }

    public void goToScene2(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void goToScene1(ActionEvent e) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/scene1.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Test(){
        System.out.println("POL krot noob");
    }
}

package application;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controller {



    @FXML
    private AnchorPane pane1;

    @FXML
    private ImageView imagen;
    @FXML
    private AnchorPane paneBoton;

    @FXML
    private JFXButton botonSign;

    @FXML
    private JFXButton botonBack;




    public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//translateAnimation(0.1, pane2, 600);
		//translateAnimation(0.1, pane3, 600);
		rotationAnimation(25,imagen, 360 * 10);
		paneBoton.setVisible(false);
		translateAnimation(0.2,paneBoton,600);

	}

    public void rotationAnimation(int duracion,Node node, int distancia) {
		RotateTransition rotacion = new RotateTransition(Duration.seconds(duracion), node);
		rotacion.setByAngle(distancia);
		rotacion.play();

	}
    public void translateAnimation(double duracion, Node node, int distancia) {
		TranslateTransition translate = new TranslateTransition(Duration.seconds(duracion), node);

		translate.setByY(distancia);
		translate.play();

	}
    public void nextAction() {

    	paneBoton.setVisible(true);
		translateAnimation(3,paneBoton,-600);


	}
    public void backAction(){
    	paneBoton.setVisible(false);
		translateAnimation(0.2,paneBoton,600);

    }


}

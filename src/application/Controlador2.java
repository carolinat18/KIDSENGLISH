package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 * Este controlador maneja las categorias que tendra el juego
 * activamos botones de la ventana
 */
public class Controlador2 implements Initializable {
	
	@FXML
	private Button ExitButton;
	private Button Animals;
	private Button Fruits;
	private Button Numbers;
	
	/**
	 * Inicializa el controlador de la clase.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Este metodo es para el boton Exit, este cierra la aplicacion
	 * @param event evento del boton del componente del fxml
	 */
	@FXML
	public void Exit (ActionEvent event) {
		System.exit(0);
		
	}
	
	/**
	 * Metodo que carga el menu de la categoria animales
	 * @param event evento del boton de la categoria animales
	 */
	@FXML
	public void MenuAnimals (ActionEvent event) {	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Animals.fxml"));
			Parent root = loader.load();	
			ControladorAnimals controlador = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
			stage.showAndWait();
		} catch (IOException ex) {
			Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	/**
	 * Metodo que carga el menu de la categoria frutas
	 * @param event evento del boton de la categoria frutas
	 */
	@FXML
	public void MenuFruits (ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Fruits.fxml"));
			Parent root = loader.load();
			ControladorFruits controlador = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
			stage.showAndWait();
		} catch (IOException ex) {
			Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	/**
	 * Metodo que carga el menu de la categoria numeros
	 * @param event evento del boton de la categoria numeros
	 */
	@FXML
	public void MenuNumbers (ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Numbers.fxml"));
			Parent root = loader.load();
			ControladorNumbers controlador = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
			stage.showAndWait();
		} catch (IOException ex) {
			Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}


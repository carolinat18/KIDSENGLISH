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
 * este controlador es para la pagina principal, activamos los dos botones "Exit" y "Start".
 * aqui nombramos los botones de la ventana los nombres deben coincidir con los archivos fxml
 */
public class Controlador1 implements Initializable {
	
	@FXML
	private Button ExitButton;
	private Button Start;
	
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
	 * Metodo start para iniciar el juego
	 * @param event evento del boton start
	 */
	@FXML
	public void Empezar (ActionEvent event) {	
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/MenuCategorias.fxml"));
			Parent root = loader.load();
			Controlador2 controlador = loader.getController();
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


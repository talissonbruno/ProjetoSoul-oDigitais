package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	/**Memu cadastro*/
	@FXML
	private Menu menuRegister;
	
	@FXML
	private MenuItem menuItemCliente;
	
	@FXML
	private MenuItem menuItemTecnico;
	
	@FXML
	private MenuItem menuItemUsuario;
	
	@FXML
	private MenuItem menuItemArea;
	/**Memu Analises físicas */
	@FXML
	private Menu menuItemPhysicalAnalyzes;
	
	/**Memu Analises quimicas*/
	@FXML
	private Menu menuItemChemicalAnalysis;
	
	/**Memu Cultivo*/
	@FXML
	private Menu menuItemCultivation;
	
	/**Memu Ajudar*/
	@FXML
	private Menu menuItemHelp;
	
	/**Memu Sair*/
	@FXML
	private Menu menuItemExit;
	
	@FXML
	public void onMenuItemCliente() {
		loadView("/gui/ClienteView.fxml");
	}
	@FXML
	public void onMenuItemUsuario() {
		System.out.println("/gui/UsuarioView.fxml");
	}
	@FXML
	public void onMenuItemTecnico() {
		System.out.println("/gui/TecnicoView.fxml");
	}
	@FXML
	public void onMenuItemArea() {
		System.out.println("/gui/AreaView.fxml");
	}
				
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox =(VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());


			}
		catch (IOException e) {
			Alerts.showAlert("IO excepiotion", "Error loanding", e.getMessage(), AlertType.ERROR);
		}

	}

}

package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteView implements Initializable{
	
	@FXML
	private TextField txtIdCliente;
	
	@FXML
	private TextField txtNameCliente;
	
	@FXML
	private TextField txtDTNascCliente;
	
	@FXML
	private TextField txtEmailCliente;
	
	@FXML
	private TextField txtTelefoneCliente;
	
	@FXML
	private TextField txtEnderecoCliente;
	
	@FXML
	private Button btSalvar;

	@FXML
	private Button btCancela;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}

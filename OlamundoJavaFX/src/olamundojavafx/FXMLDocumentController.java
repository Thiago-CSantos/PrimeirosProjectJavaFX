/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author thiag
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnClique;
    @FXML
    private Label lb_menssagem;
    
    private void clicouBotao(ActionEvent event) {
        lb_menssagem.setText("Ola Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

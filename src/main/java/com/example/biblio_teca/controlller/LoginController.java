package com.example.biblio_teca.controlller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import  javafx.scene.Scene;
import  javafx.scene.control.TextField;              //importo todas las dependencias
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField user;
    @FXML
    private TextField contra;
    @FXML
    private Label errorLabel;
    @FXML
    private Button btonIniciar;

    protected void OnSesion() throws Exception {

        String contra = this.contra.getText();
        String user = this.user.getText();

        if (user.equals("biblio") && contra.equals("teca")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setTitle("Menu de libros");
                stage.setScene(new Scene(root));
                stage.show();
                ((Stage) btonIniciar.getScene().getWindow()).close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            errorLabel.setText("Contraseña o usuario incorrectos");
        }
    }
}
// Oal amigazos

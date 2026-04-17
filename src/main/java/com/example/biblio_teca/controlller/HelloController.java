package com.example.biblio_teca.controlller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloController {
    @FXML
    private Label errorLabel;
    @FXML
    private TextField usuarioText;
    @FXML
    private TextField contraText;


    private final String usuario_correcto= "admin";
    private final String contrasena_correcta = "1234";


    @FXML
    private void iniciarSesion() {

        String usuarioIngresado = usuarioText.getText();
        String contrasenaIngresada = contraText.getText();


        if (usuarioIngresado.isEmpty() || contrasenaIngresada.isEmpty()) {
            errorLabel.setText("Por favor llena todos los campos.");
            return;
        }

        // Verificar si el usuario y contraseña son correctos
        if (usuarioIngresado.equals(usuario_correcto) &&
                contrasenaIngresada.equals(contrasena_correcta)) {
            abrirMenu();

        } else {
            errorLabel.setText("Usuario o contraseña incorrectos.");
        }
    }

    private void abrirMenu() {
        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/biblio_teca/menu-view.fxml")
            );

            Scene escenaMenu = new Scene(loader.load());

            // Obtiene la ventana actual y cambia la escena
            Stage ventanaActual = (Stage) usuarioText.getScene().getWindow();
            ventanaActual.setScene(escenaMenu);
            ventanaActual.setTitle("Menú Principal");
            ventanaActual.show();

        } catch (IOException e) {
            errorLabel.setText("Error al cargar el menú.");
            e.printStackTrace();
        }
    }





}

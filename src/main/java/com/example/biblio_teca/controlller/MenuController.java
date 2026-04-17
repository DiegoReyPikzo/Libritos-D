package com.example.biblio_teca.controlller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private javafx.scene.control.Button btnAgregar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void OnAgregar() {
        cambiarVentana("agregar-view.fxml", "Agregar Libros");
    }

    @FXML
    private void OnBuscar() {
        cambiarVentana("buscar-view.fxml", "Buscar Libros");
    }

    @FXML
    private void OnBiblioteca() {
        cambiarVentana("historial-view.fxml", "Biblioteca");
    }

    @FXML
    private void OnExit() {
        Stage ventana = (Stage) btnAgregar.getScene().getWindow();
        ventana.close();
    }

    private void cambiarVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/example/biblio_teca/" + fxml)
            );
            Scene nuevaEscena = new Scene(loader.load());
            Stage ventanaActual = (Stage) btnAgregar.getScene().getWindow();
            ventanaActual.setScene(nuevaEscena);
            ventanaActual.setTitle(titulo);
            ventanaActual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
module com.example.biblio_teca {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.biblio_teca to javafx.fxml;
    exports com.example.biblio_teca;
}
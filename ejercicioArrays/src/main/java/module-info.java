module com.example.ejercicioarrays {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.ejercicioarrays to javafx.fxml;
    exports com.example.ejercicioarrays;
}
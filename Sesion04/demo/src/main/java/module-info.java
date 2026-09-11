module pe.edu.upeu.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens pe.edu.upeu.demo to javafx.fxml;
    exports pe.edu.upeu.demo;
}
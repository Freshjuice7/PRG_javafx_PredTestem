module com.example.lol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lol to javafx.fxml;
    opens com.example.lol.controller to javafx.fxml;
    opens com.example.lol.model to javafx.fxml;
    exports com.example.lol;

}
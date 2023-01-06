module com.example.tetris {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.keyboardmaestro.tetris to javafx.fxml;
    exports com.keyboardmaestro.tetris;
}
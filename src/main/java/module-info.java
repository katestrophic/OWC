module katestrophic.owc {
    requires javafx.controls;
    requires javafx.fxml;

    // allow JavaFX (FXML) access to modules
    opens katestrophic.owc to javafx.fxml;

    // export the main package so the application can start
    exports katestrophic.owc;
}

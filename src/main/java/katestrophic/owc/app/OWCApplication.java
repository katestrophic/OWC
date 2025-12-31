package katestrophic.owc.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/// @purpose JavaFX Application launcher
public class OWCApplication extends Application {

    @Override
    public void start (Stage stage) throws IOException {
        var root = new StackPane(new Label("OWC Dashboard"));
        var scene = new Scene(root);

        stage.setTitle("Ocean Workspace Companion");
        stage.setScene(scene);

        stage.show();
    }
}

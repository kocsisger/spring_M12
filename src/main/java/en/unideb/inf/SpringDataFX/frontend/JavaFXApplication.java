package en.unideb.inf.SpringDataFX.frontend;

import en.unideb.inf.SpringDataFX.SpringDataFxApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;

public class JavaFXApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainPage.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        SpringApplication.run(SpringDataFxApplication.class);
    }
}

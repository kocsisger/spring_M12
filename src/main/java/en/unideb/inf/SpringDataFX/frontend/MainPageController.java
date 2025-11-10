package en.unideb.inf.SpringDataFX.frontend;

import en.unideb.inf.SpringDataFX.SpringDataFxApplication;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    private ConfigurableApplicationContext ctx;

    public void handleStartButton(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxApplication.class);
    }

    public void handleStopButton(ActionEvent actionEvent) {
        ctx.close();
    }

    public void handlePrinButton(ActionEvent actionEvent) {
    }
}

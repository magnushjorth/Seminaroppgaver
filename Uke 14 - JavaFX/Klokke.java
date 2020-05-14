import java.time.LocalTime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Klokke extends Application {
    Text hilsen = new Text(naa());

    class SekundTeller extends Thread {
        public void run() {
            boolean slutt = false;
            while (! slutt) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) { slutt = true; }
                hilsen.setText(naa());
            }
        }
    }

    public void start(Stage stage) {
        hilsen.setY(100);
        hilsen.setFont(new Font(100));

        Pane kulisser = new Pane(hilsen);

        Scene scene = new Scene(kulisser);

        stage.setTitle("Klokken er...");
        stage.setScene(scene);
        stage.show();

        new SekundTeller().start();
    }

    private static String naa() {
        LocalTime t = LocalTime.now();
        return String.format("%02d:%02d:%02d", t.getHour(), t.getMinute(), t.getSecond());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
lsimport javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Rutenett extends Application {
    
    public void start(Stage stage) {

    GridPane pane = new GridPane();

    int teller = 1;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            
            Text text = new Text(""+teller);
            text.setFont(new Font(42));

            Rectangle rect = new Rectangle(120, 120, Color.SKYBLUE);
            rect.setStroke(Color.BLACK);

            StackPane cell = new StackPane(rect, text);

            pane.add(cell, i, j);

            teller++;
        }
    }

    Scene scene = new Scene(pane);

    stage.setScene(scene);
    stage.setTitle("Rutenett");
    stage.show();
    }

    public static void main(String[] args) {
    launch(args);
    }
}
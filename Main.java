package application;
//The second file's change

//B2 change change


//B1 change change


//C4 change change
//partner change
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
// partner changed

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("/application/MyScence.fxml"));

            primaryStage.setTitle("Lab1-结对编程-有向图");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.SocketException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Rahim's chat box");
        primaryStage.setScene(new Scene(root, 481, 434));
        primaryStage.show();
        }
        catch (SocketException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

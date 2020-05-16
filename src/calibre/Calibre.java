/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calibre;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

/**
 *
 * @author student
 */
public class Calibre extends Application {
    
@Override
public void start(Stage stage) throws Exception {        
        try
        {
            Parent part = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace(System.out);
            System.out.println("Problem loading column screen.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
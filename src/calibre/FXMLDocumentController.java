/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calibre;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleAddBookButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleEditMetadataButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleFetchNewsButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleRemoveButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleLibraryButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
       
    @FXML
    private void handleReadBook(ActionEvent event) {
        try
        {
            Parent part = FXMLLoader.load(getClass().getResource("/calibre/ReadScreen.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace(System.out);
            System.out.println("Problem loading book screen.");
        }
    }
    
    @FXML 
    private void handleConvertBook(ActionEvent event)
    {
        try
        {
            Parent part = FXMLLoader.load(getClass().getResource("/calibre/ConvertScreen.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(part);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace(System.out);
            System.out.println("Problem loading convert screen.");
        }
    }
    
    @FXML 
    private void handleAddRemoveColumns(ActionEvent event)
    {
        try
        {
            Parent part = FXMLLoader.load(getClass().getResource("/calibre/ColumnScreen.fxml"));
            Stage stage = new Stage();
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
    
    @FXML
    private void handleStub(ActionEvent event)
    {
        VBox vBox = new VBox(new Label("                             \n    Button Stub    \n                             "));
        Scene scene = new Scene(vBox);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

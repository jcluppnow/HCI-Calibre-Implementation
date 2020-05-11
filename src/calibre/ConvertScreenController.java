/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calibre;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author student
 */
public class ConvertScreenController implements Initializable {

    @FXML
    private Label SynopsisLabel;
    @FXML
    private ComboBox OriginalFormatCB, FinalFormatCB;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setSynopsisLabel();
        setComboBoxes();
    }    
    
    private void setSynopsisLabel()
    {
        String label = "The Old Man and the Sea \ntells the story of a battle \nbetween an aging, \nexperienced fisherman, \nSantiago, and a large \nmarlin. ... He is so \nunlucky that his young \napprentice, Manolin, \nhas been forbidden by \nhis parents to sail \nwith him and has been \ntold instead to fish \nwith successful \nfishermen.";
        SynopsisLabel.setFont(Font.font("Cambria", 15));
        SynopsisLabel.setText(label);
    }
    
    private void setComboBoxes()
    {
        OriginalFormatCB.getItems().removeAll(OriginalFormatCB.getItems());
        OriginalFormatCB.getItems().addAll("AZW3", "EPUB", "PDF", "EBOOK");
        FinalFormatCB.getItems().removeAll(FinalFormatCB.getItems());
        FinalFormatCB.getItems().addAll("EPUB", "MOBI", "DOCX", "PDF");
    }
    
    @FXML
    private void handleConvert()
    {
        VBox vBox = new VBox(new Label("                             \n    Successful Conversion    \n                             "));
        Scene scene = new Scene(vBox);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
}

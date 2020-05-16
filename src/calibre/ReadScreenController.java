package calibre;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author student
 */
public class ReadScreenController implements Initializable {

    @FXML
    private Label label, pageNumLabel;
    private ArrayList<String> book;
    private int currentPage;
    private int pageIndex;
    
    @FXML
    private void keyPressed(KeyEvent keyEvent)
    {
        if (keyEvent.getCode() == KeyCode.LEFT)
        {
            if (pageIndex > 0)
            {
                pageIndex--;
                currentPage--;
                System.out.println("Previous Page Debug: Current Page Value: " + pageIndex);
                String line = book.get(pageIndex);
                label.setFont(Font.font("Cambria", 20));
                label.setText(line);
                pageNumLabel.setFont(Font.font("Cambria", 20));
                pageNumLabel.setText(Integer.toString(currentPage));
            }  
        }
        
        if (keyEvent.getCode() == KeyCode.RIGHT)
        {
            if (pageIndex < 2)
            {
                pageIndex++;
                currentPage++;
                System.out.println("Next Page Debug: Current Page Value: " + pageIndex); 
                String line = book.get(pageIndex);
                label.setFont(Font.font("Cambria", 20));
                label.setText(line);
                pageNumLabel.setFont(Font.font("Cambria", 20));
                pageNumLabel.setText(Integer.toString(currentPage));
            }
        }
    }
    @FXML
    private void handleNextPage(ActionEvent event) {
        if (pageIndex < 2)
        {
            pageIndex++;
            currentPage++;
            System.out.println("Next Page Debug: Current Page Value: " + pageIndex); 
            String line = book.get(pageIndex);
            label.setFont(Font.font("Cambria", 20));
            label.setText(line);
            pageNumLabel.setFont(Font.font("Cambria", 20));
            pageNumLabel.setText(Integer.toString(currentPage));
        }
    }
    
    @FXML
    private void handlePreviousPage(ActionEvent event){
        if (pageIndex > 0)
        {
            pageIndex--;
            currentPage--;
            System.out.println("Previous Page Debug: Current Page Value: " + pageIndex);
            String line = book.get(pageIndex);
            label.setFont(Font.font("Cambria", 20));
            label.setText(line);
            pageNumLabel.setFont(Font.font("Cambria", 20));
            pageNumLabel.setText(Integer.toString(currentPage));

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
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        book = new ArrayList<>();
        book.add("                 The Old Man and the Sea By Ernest Hemingway\n\n\n\nHe was an old man who fished alone in a skiff in the Gulf Stream \n\nand he had gone eighty-four days now without taking a fish.\n\nIn the first forty days a boy had been with him. But after forty \n\ndays without a fish the boy’s parents had told him that the old \n\nman was now definitely and finally salao, which is the worst form \n\nof unlucky, and the boy had gone at their orders in \n\nanother boat which caught three good fish the first week.\n\nIt made the boy sad to see the old man come in each day with his \n\nskiff empty and he always went down to help him carry either the \n\ncoiled lines or the gaff and harpoonand the sail that was furled \n\naround the mast. The sail was patched with flour sacks and, furled, \n\nit looked like the flag of permanent defeat. ");
        book.add("The old man was thin and gaunt with deep wrinkles in the back \n\nof his neck. The brown blotches of the benevolent skin cancer\n\nthe sun brings from its reflection on the tropic sea were on his \n\ncheeks. The blotches ran well down the sides of his face \n\nand his hands had the deep-creased scars from handling \n\nheavy fish on the cords. But none of these scars were fresh. \n\nThey were as old as erosions in a fishless desert. Everything \n\nabout him was old except his eyes and they were the same \n\ncolor as the sea and were cheerful and undefeated.\n\n“Santiago,” the boy said to him as they climbed the bank \n\nfrom where the skiff was hauled up. “I could go \n\nwith you again. We’ve made some money.");
        book.add("The old man had taught the boy to fish and the boy loved him. \n\n“No,” the old man said. “You’re with a lucky boat. Stay with them.” \n\n“But remember how you went eighty-seven days without fish \n\nand then we caught big ones every day for three weeks.” \n\n“I remember,” the old man said. “I know you did not leave me \n\nbecause you doubted.” “It was papa made me leave. I am a \n\nboy and I must obey him.” “I know,” the old man said. \n\n“It is quite normal.” “He hasn’t much faith.” \n\n“No,” the old man said. “But we have. Haven’t we?” \n\n“Yes,” the boy said. “Can I offer you a beer on the Terrace and \n\nthen we’ll take the stuff home.” ");
        String line = book.get(0);
        label.setFont(Font.font("Cambria", 20));
        label.setText(line);
        pageIndex = 0;
        currentPage = 1;
        pageNumLabel.setFont(Font.font("Cambria", 20));
        pageNumLabel.setText(Integer.toString(currentPage));
    }
    
}

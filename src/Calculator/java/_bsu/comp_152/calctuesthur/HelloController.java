package _bsu.comp_152.calctuesthur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TextField numberDisplay;

    @FXML
    public void numberButtonPushed(ActionEvent event){
        var currentText = numberDisplay.getText();
        var ButtonPressed =(Button) event.getSource();
        var currentNumbertext = ButtonPressed.getText();
        var newText = currentNumbertext;
        numberDisplay.setText(newText);
    }
}





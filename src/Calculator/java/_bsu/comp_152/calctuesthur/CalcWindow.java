package _bsu.comp_152.calctuesthur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

public class CalcWindow {
    private int storedNumber;
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

    @FXML
    public void addButtonPressed(){
        var numbertext = numberDisplay.getText();
        storedNumber = Integer.parseInt(numbertext);
        numberDisplay.clear();
    }

    @FXML
    public void equalButtonPressed(){
        var currentNumberText = numberDisplay.getText();
        var currentNumber = Integer.parseInt(currentNumberText);
        var sum = currentNumber + storedNumber;
        numberDisplay.setText(""+sum);
    }

    @FXML
    public void clearButtonPressed(){
        numberDisplay.setText("");

    }
}

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class Controller {
    @FXML
    private TextArea vysledok;
    @FXML
    private TextField TextField1;
    @FXML
    private TextArea TextArea1;
    private Boolean prepinac = Boolean.FALSE;

    @FXML
    public void regexuj(){
        String regex = TextField1.getText();
        String text = TextArea1.getText();

        boolean match;
        if (prepinac == Boolean.FALSE) {
            match = Pattern.matches(regex, text);
        }
        else {
            match = Pattern.matches(Pattern.quote(regex), text);
        }

        if (match == Boolean.FALSE) {
            vysledok.setText("NG");
        }
        else {
            vysledok.setText("OK");
        }
    }

    @FXML
    public void prepni(){
        prepinac = !prepinac;
    }
}

package educacionit.javafx.tutorial01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Rodolfo Durante
 */
public class ClickCounterController implements Initializable {

    @FXML
    private javafx.scene.control.TextField fld_cantidad;
    private int cantidad = 0;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("You clicked me!");
        cantidad++;
        fld_cantidad.setText(String.valueOf(cantidad));
    }
    @FXML
    private void handleButtonRestar(ActionEvent event) {
        
        System.out.println("You clicked me!");
        cantidad--;
        fld_cantidad.setText(String.valueOf(cantidad));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // fld_cantidad.setEditable(false);
    }

}

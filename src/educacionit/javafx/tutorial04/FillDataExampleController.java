
package educacionit.javafx.tutorial04;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Rodolfo Durante
 */
public class FillDataExampleController implements Initializable {
    @FXML
    private TextField txt_name_value;
    @FXML
    private TextField txt_lastname_value;
    @FXML
    private TextField txt_address_value;
    @FXML
    private TextField txt_phone_value;
    @FXML
    private TextField txt_cell_value;
    @FXML
    private TextField txt_email_value;
    @FXML
    private Button btn_exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txt_name_value.setText("Juan");
        txt_lastname_value.setText("Perez");
        txt_address_value.setText("Castro Barros 333 - C.A.B.A.");
        txt_phone_value.setText("11-4956-7878");
        txt_cell_value.setText("15-6787-2356");
        txt_email_value.setText("juan.perez@educacionit.com");
    }    

    @FXML
    private void handlerBtnExit(ActionEvent event) {
        Platform.exit();
    }
    
    
}

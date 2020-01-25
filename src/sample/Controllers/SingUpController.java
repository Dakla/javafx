package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class SingUpController {
    @FXML
    public AnchorPane singUpName;
    @FXML
    public TextField singUpLogin;
    @FXML
    public PasswordField singUpPwd;
    @FXML
    public Button singUpBtn;
    @FXML
    public TextField singUpLastName;
    @FXML
    public TextField singUpCountry;
    @FXML
    public ToggleGroup Gender;
}

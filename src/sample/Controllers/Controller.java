package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    public Button loginLoginBtn;

    @FXML
    public Button loginRegBnt;

    @FXML
    private ResourceBundle resourceBundle;

    @FXML
    private URL location;

    @FXML
    private TextField loginLogin;

    @FXML
    private PasswordField loginPwd;

    @FXML
    void initialize() {
        loginLoginBtn.setOnAction(event -> {
            System.out.println("Войти");
        });
    }
}

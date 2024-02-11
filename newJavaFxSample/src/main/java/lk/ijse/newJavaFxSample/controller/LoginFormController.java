package lk.ijse.newJavaFxSample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.newJavaFxSample.db.Database;

import java.io.IOException;
import java.util.Objects;

public class LoginFormController {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane rootNode;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        if(userName.equals(Database.USER_NAME) && password.equals(Database.PW)) {
            AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

            Scene scene = new Scene(rootNode);

            Stage stage = (Stage)this.rootNode.getScene().getWindow();

            stage.setScene(scene);
            stage.setTitle("Dashboard");

            stage.centerOnScreen();
            stage.show();
        } else {
            new Alert(Alert.AlertType.ERROR,"Login Faild").show();
        }
        
    }

    public void hyperSingUpOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/singup_form.fxml")));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage)this.rootNode.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Sing Up");

        stage.centerOnScreen();
        stage.show();
    }
}

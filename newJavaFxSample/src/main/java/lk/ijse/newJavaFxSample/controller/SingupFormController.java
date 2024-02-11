package lk.ijse.newJavaFxSample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SingupFormController {

    public AnchorPane singUpNode;
    public PasswordField txtPassword;
    public TextField txtUserName;

    public void btnLoginOnAction(ActionEvent actionEvent) {

    }

    public void hyperSingInOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/login_form.fxml")));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage)this.singUpNode.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Sing Up");

        stage.centerOnScreen();
        stage.show();

    }
}

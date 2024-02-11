package lk.ijse.newJavaFxSample.controller;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import lk.ijse.newJavaFxSample.AppInitializer;
import lk.ijse.newJavaFxSample.AppInitializerWrapper;

import java.io.IOException;
import java.util.Objects;

public class DashboardFormController {


    public AnchorPane rootNode;
    public AnchorPane rootNodePane;
    public JFXTextArea textMainLab;


    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/customerPane_form.fxml"));

        AnchorPane customerForm =loader.load();

        rootNodePane.getChildren().clear();
        rootNodePane.getChildren().add(customerForm);
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/itemPane_form.fxml"));

        AnchorPane itemForm =loader.load();

        rootNodePane.getChildren().clear();
        rootNodePane.getChildren().add(itemForm);
    }

    public void btnDashboardOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/dashbordPane_form.fxml"));

        AnchorPane dashboardForm = loader.load();

        rootNodePane.getChildren().clear();
        rootNodePane.getChildren().add(dashboardForm);
    }

    public void btnSuppliersOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/supplierPane_form.fxml"));

        AnchorPane supplierForm = loader.load();

        rootNodePane.getChildren().clear();
        rootNodePane.getChildren().add(supplierForm);
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/login_form.fxml")));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);


        stage.centerOnScreen();
        stage.setTitle("Login Form");

    }

}

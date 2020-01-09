package dankesttourismprogram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author brianaranda
 */
public class MenuController implements Initializable {

    @FXML
    private Button guestButton;

    @FXML
    private Button employeeButton;

    @FXML
    private Button locTVButton;

    @FXML
    private Button landmarksButton;

    @FXML
    private Button companyButton;

    @FXML
    private Button skillButton;

    @FXML
    private Button avoidButton;

    @FXML
    void handleAvoidButtonAction(ActionEvent event) {
        System.out.println("Avoid Places clicked!");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PlacesToAvoid.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Places to Avoid");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.");
        }
    }

    @FXML
    void handleCompanyButtonAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Company.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Company");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.");
        }
    }

    @FXML
    void handleEmployeeButtonAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Employee.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Employees");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.");
        }
    }

    @FXML
    void handleGuestButtonAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Guest.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Guests");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.");
        }
    }

    @FXML
    void handleLandmarksButtonAction(ActionEvent event) {
                try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Landmarks.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Landmarks");
            stage.setScene(new Scene(root1));  
            stage.show();
        }catch (Exception e){
            System.out.println("Can't load new window.");
        }
    }

    @FXML
    void handleSkillButtonAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Skills.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Skills");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.");
        }
    }

    @FXML
    void handlelocTVButtonAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Locations.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Locations to Visit");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

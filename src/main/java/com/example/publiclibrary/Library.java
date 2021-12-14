package com.example.publiclibrary;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Library extends BaseOfBooks{
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Account user;
    private UserCardFile userCardFile;
    private Library library;
    private BaseOfBooks baseOfBooks;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public void switchToReaderCardFromCatalog(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("readerCardMenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBookView(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("bookView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCatalog(ActionEvent event) {
    }
    public void getUniversalInstance(){

    }
    public void findBook(){

    }
    public void payDebt(int summOfDebt){

    }
    public void registerNewUser() {

    }
    public void takeBookToReadAtHome(){

    }
    public void takeBookToReadInLibrary(){

    }

    @Override
    public void bringBookBack() {
        super.bringBookBack();
    }
    public void activateAccount(){

    }
}

package org.group2.textprocessingtool.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;

public class TextProcessingMainController {

    private File currentFile;

    private Stage primaryStage;

    @FXML
    public TextField searchItem;
    @FXML
    public TextField replacementWord;
    @FXML
    private TextArea textInputArea;

    public void setPrimaryStage(Stage primaryStage) {

        this.primaryStage = primaryStage;
    }

    public void handleOpen(ActionEvent actionEvent) {
    }

    public void handleSaveTwo(ActionEvent actionEvent) {
    }

    public void handleExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void handleUndo(ActionEvent actionEvent) {
        textInputArea.undo();
    }

    public void handleRedo(ActionEvent actionEvent) {
        textInputArea.redo();
    }

    public void handleCut(ActionEvent actionEvent) {
    }

    public void handleCopy(ActionEvent actionEvent) {
    }

    public void handlePaste(ActionEvent actionEvent) {
    }

    public void handleFind(ActionEvent actionEvent) {
    }

    public void handleReplace(ActionEvent actionEvent) {
    }

    public void handleCustomRegexTwo(ActionEvent actionEvent) {
    }

    public void handleCustomRegex(ActionEvent actionEvent) {
    }

    public void handlePhone(ActionEvent actionEvent) {
    }

    public void handleMail(ActionEvent actionEvent) {
    }

    public void handleDate(ActionEvent actionEvent) {
    }

    public void handleAbout(ActionEvent actionEvent) {
    }


}

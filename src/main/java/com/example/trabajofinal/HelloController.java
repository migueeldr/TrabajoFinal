package com.example.trabajofinal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//hola caracola
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
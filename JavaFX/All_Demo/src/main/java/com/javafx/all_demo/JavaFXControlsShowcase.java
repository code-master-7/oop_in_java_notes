package com.javafx.all_demo;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;

public class JavaFXControlsShowcase extends Application {

    private Text eventsLog;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Controls Showcase");

        // Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Labels
        Label labelText = new Label("Text Field:");
        Label labelPassword = new Label("Password Field:");
        Label labelTextArea = new Label("Text Area:");
        Label labelRadioButton = new Label("Radio Buttons:");
        Label labelCheckBox = new Label("Checkboxes:");
        Label labelChoiceBox = new Label("Choice Box:");
        Label labelComboBox = new Label("Combo Box:");
        Label labelListView = new Label("List View:");
        Label labelDatePicker = new Label("Date Picker:");
        Label labelColorPicker = new Label("Color Picker:");
        Label labelButton = new Label("Button:");
        Label labelToggleButton = new Label("Toggle Button:");

        Label labelOverwriteText = new Label("Overwrite Text Field:");

        // Text Field
        TextField textField = new TextField();
        textField.setPromptText("Enter text");
        textField.textProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Text Field changed: " + newValue)
                labelOverwriteText.setText("Text Field changed: " + newValue)

        );

        // Password Field
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter password");
        passwordField.textProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Password Field changed: " + newValue)
                        labelOverwriteText.setText("Password Field changed: " + newValue)
        );

        // Text Area
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(4);
        textArea.setWrapText(true);
        textArea.textProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Text Area changed: " + newValue)
                        labelOverwriteText.setText("Text Area changed: " + newValue)
        );

        // Radio Buttons
        ToggleGroup radioGroup = new ToggleGroup();
        RadioButton radioButton1 = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);
        radioGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
//                logEvent("Radio Button selected: " + ((RadioButton) newValue).getText());
                labelOverwriteText.setText("Radio Button selected: " + ((RadioButton) newValue).getText());
            }
        });

        // Checkboxes
        CheckBox checkBox1 = new CheckBox("Option A");
        CheckBox checkBox2 = new CheckBox("Option B");
        checkBox1.selectedProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Checkbox 1: " + (newValue ? "Selected" : "Unselected"))
                        labelOverwriteText.setText("Checkbox 1"+(newValue ? "Selected" : "Unselected"))
        );
        checkBox2.selectedProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Checkbox 2: " + (newValue ? "Selected" : "Unselected"))
                labelOverwriteText.setText("Checkbox 2"+(newValue ? "Selected" : "Unselected"))
        );

        // Choice Box
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Apple", "Banana", "Orange");
        choiceBox.setValue("Apple"); // Set initial selection
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Choice Box selected: " + newValue)
                labelOverwriteText.setText("Choice Box selected: " + newValue)
        );

        // Combo Box
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Red", "Green", "Blue");
        comboBox.setEditable(true); // Allow user input
        comboBox.valueProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Combo Box selected: " + newValue)
                        labelOverwriteText.setText("Combo Box selected: " + newValue)
        );

        // List View
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Item 1", "Item 2", "Item 3");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // Allow multiple selections
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
//                logEvent("List View selected: " + newValue);
                labelOverwriteText.setText("List View selected: " + newValue);
            }
        });

        // Date Picker
        DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.now());
        datePicker.valueProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Date Picker selected: " + newValue)
                        labelOverwriteText.setText("Date Picker selected: " + newValue)
        );

        // Color Picker
        ColorPicker colorPicker = new ColorPicker();
        colorPicker.valueProperty().addListener((observable, oldValue, newValue) ->
//                logEvent("Color Picker selected: " + newValue)
                labelOverwriteText.setText("Color Picker selected: " + newValue)
        );

        // Button
        Button button = new Button("Click Me");
        button.setOnAction(e -> labelOverwriteText.setText("Button clicked"));

        // Toggle Button
        ToggleButton toggleButton = new ToggleButton("On/Off");
        toggleButton.setOnAction(e ->
//                logEvent("Toggle Button: " + (toggleButton.isSelected() ? "On" : "Off"))
                labelOverwriteText.setText("Toggle Button: " + (toggleButton.isSelected() ? "On" : "Off"))
        );

        // Events Log (TextView)
        eventsLog = new Text();
        eventsLog.setWrappingWidth(300); // Adjust wrapping width as needed



        // Add controls to grid
        grid.add(labelText, 0, 0);
        grid.add(textField, 1, 0);
        grid.add(labelPassword, 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(labelTextArea, 0, 2);
        grid.add(textArea, 1, 2);
        grid.add(labelRadioButton, 0, 3);
        VBox radioVBox = new VBox(10);
        radioVBox.getChildren().addAll(radioButton1, radioButton2);
        grid.add(radioVBox, 1, 3);
        grid.add(labelCheckBox, 0, 4);
        HBox checkBoxHBox = new HBox(10);
        checkBoxHBox.getChildren().addAll(checkBox1, checkBox2);
        grid.add(checkBoxHBox, 1, 4);
        grid.add(labelChoiceBox, 0, 5);
        grid.add(choiceBox, 1, 5);
        grid.add(labelComboBox, 0, 6);
        grid.add(comboBox, 1, 6);
        grid.add(labelListView, 0, 7);
        grid.add(listView, 1, 7);
        grid.add(labelDatePicker, 0, 8);
        grid.add(datePicker, 1, 8);
        grid.add(labelColorPicker, 0, 9);
        grid.add(colorPicker, 1, 9);
        grid.add(labelButton, 0, 10);
        grid.add(button, 1, 10);
        grid.add(labelToggleButton, 0, 11);
        grid.add(toggleButton, 1, 11);

        grid.add(eventsLog, 0, 12, 2, 1); // Add events log spanning two columns

        TextField overwriteTextField = new TextField();
        overwriteTextField.setPromptText("Enter text (overwrites)");
        overwriteTextField.setOnKeyPressed(event -> {
            overwriteTextField.setText(eventsLog.toString()); // Overwrites with the new key
        });

//        grid.add("Overwritten feild ", 0, 12); // Adjust row as needed
        grid.add(labelOverwriteText, 1, 12); // Adjust row as needed

        // Scene and Stage
        Scene scene = new Scene(grid, 600, 700); // Increase height for events log
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void logEvent(String event) {
        eventsLog.setText(eventsLog.getText() + event + "\n");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
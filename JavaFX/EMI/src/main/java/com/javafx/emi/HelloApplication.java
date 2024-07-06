package com.javafx.emi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Nodes ------------------------------------

        // Column 0 ----------
        Label AI_label = new Label("Annual Interest:");
        GridPane.setConstraints(AI_label , 0 , 0);

        Label numberOfYear_label = new Label("Number of years:");
        GridPane.setConstraints(numberOfYear_label , 0 , 1);

        Label loanAmount_label = new Label("Loan Amount:");
        GridPane.setConstraints(loanAmount_label,0,2);

        Label monthlyPayment_label = new Label("Monthly Payment:");
        GridPane.setConstraints(monthlyPayment_label,0,3);

        Label totalPayment_label = new Label("Total Payment:");
        GridPane.setConstraints(totalPayment_label,0,4);

        Label errorMsg = new Label();
        GridPane.setConstraints(errorMsg,0,5);

        // Column 1 ----------------------------

        TextField AI_tf = new TextField();
        GridPane.setConstraints(AI_tf,1,0);

        TextField numberOfYear_tf = new TextField();
        GridPane.setConstraints(numberOfYear_tf,1,1);

        TextField loanAmount_tf = new TextField();
        GridPane.setConstraints(loanAmount_tf,1,2);

        Label monthlyPayment_result = new Label();
        GridPane.setConstraints(monthlyPayment_result,1,3);

        Label totalPayment_result = new Label();
        GridPane.setConstraints(totalPayment_result,1,4);

        Button calculateButton = new Button("Calculate");
        GridPane.setConstraints(calculateButton,1,5);

        // Button event -------

        calculateButton.setOnAction(event->{
            String ai_input = AI_tf.getText().trim();
            String noy_input = numberOfYear_tf.getText().trim();
            String la_input = loanAmount_tf.getText().trim();

            if(ai_input.length() == 0 || noy_input.length() == 0 || la_input.length() == 0){
                errorMsg.setText("Enter valid inputs.");
            }else{
                errorMsg.setText("");

                /* Formula
                *
                * EMI = P * R ( 1 + R ) ^ N / ( ( 1 + R) ^ N - 1 )
                * N = nof_input
                * R = ai_input / 12 / 100
                * P = la_input
                *
                * */

                float r = Float.parseFloat(ai_input) / 12.0f / 100.0f ;
                float temp = 1; // temp = ( 1 + R) ^ N
                for(int i=0;i<Float.parseFloat(noy_input)*12;i++) temp *= ( 1 + r);

                float EMI = (Float.parseFloat(la_input) * r * temp) / (temp - 1);

                float total = EMI * Float.parseFloat(noy_input) * 12;

                monthlyPayment_result.setText(String.valueOf(EMI));
                totalPayment_result.setText(String.valueOf(total));
            }
        });

        // scene --------------------------------------------------------------------------------
        GridPane root = new GridPane();
        root.getChildren().addAll(AI_label , AI_tf , numberOfYear_label , numberOfYear_tf , loanAmount_label,loanAmount_tf,monthlyPayment_label,monthlyPayment_result,totalPayment_label , totalPayment_result,errorMsg , calculateButton);


        // stage ----------------------------------------------------------------------------------
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("EMI Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
module com.javafx.emi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.emi to javafx.fxml;
    exports com.javafx.emi;
}
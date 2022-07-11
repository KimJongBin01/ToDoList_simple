module com.example.kjb_javafx_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kjb_javafx_practice to javafx.fxml;
    exports com.example.kjb_javafx_practice;
}
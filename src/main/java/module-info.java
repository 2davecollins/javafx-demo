module com.nci.lab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nci.lab1 to javafx.fxml;
    exports com.nci.lab1;
}
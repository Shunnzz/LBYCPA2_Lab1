module com.example.lbycpa2_lab1_group {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.lbycpa2_lab1_group to javafx.fxml;
    exports com.example.lbycpa2_lab1_group;
}
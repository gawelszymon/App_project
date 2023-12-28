module com.example.app_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;


    opens com.example.app_project to javafx.fxml;
    exports com.example.app_project;
}
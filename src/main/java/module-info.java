module com.example.app_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires org.jsoup;


    opens com.example.app_project to javafx.fxml;
    exports com.example.app_project;
}
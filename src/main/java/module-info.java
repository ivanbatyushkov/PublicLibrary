module com.example.publiclibrary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.publiclibrary to javafx.fxml;
    exports com.example.publiclibrary;
}
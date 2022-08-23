module com.example.tugaspraktikum_testing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tugaspraktikum_testing to javafx.fxml;
    exports com.example.tugaspraktikum_testing;
}
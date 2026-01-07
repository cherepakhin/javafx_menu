module org.example.menu1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.menu1 to javafx.fxml;
    exports org.example.menu1;
}
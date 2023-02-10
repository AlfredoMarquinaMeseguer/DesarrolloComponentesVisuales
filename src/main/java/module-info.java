module es.cifpcarlos3.fxled {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.base;
    
    opens es.cifpcarlos3.fxled to javafx.fxml;
    exports es.cifpcarlos3.fxled;
}

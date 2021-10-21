module _bsu.comp_152.calctuesthur {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens _bsu.comp_152.calctuesthur to javafx.fxml;
    exports _bsu.comp_152.calctuesthur;
}
/**
 * 
 */
/**
 * 
 */
module EjercicioP {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;

	
	opens productos to javafx.base, javafx.graphics, javafx.fxml;
	opens controller to javafx.fxml,javafx.base;
	opens com.dein.productolabelwidget to javafx.base, javafx.fxml, javafx.graphics;
}
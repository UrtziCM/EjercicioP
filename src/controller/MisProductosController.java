package controller;

import com.dein.productolabelwidget.*;

import javafx.fxml.FXML;
import javafx.scene.image.Image;

public class MisProductosController {

    @FXML
    private ProductoLabel producto1;

    @FXML
    private ProductoLabel producto2;

    @FXML
    private ProductoLabel producto3;

    public void initialize() {
    	producto1.setImage(new Image(this.getClass().getResource("/com/dein/productolabelwidget/images/pan.png").toString()));
    	producto1.setName("Pan");
    	producto1.setStock(10);
    	
    	producto2.setImage(new Image(this.getClass().getResource("/com/dein/productolabelwidget/images/manzana.png").toString()));
    	producto2.setName("Manzana");
    	producto2.setStock(200);
    	
    	producto3.setImage(new Image(this.getClass().getResource("/com/dein/productolabelwidget/images/leche.png").toString()));
    	producto1.setName("Leche");
    	producto1.setStock(50);
    	
    
    	
    }
    
}

package Model.Food;

import Model.Shape;

import javax.swing.*;
import java.awt.*;

public class ShapeFood implements Shape {

    public Image apple;

    @Override
    public void loadShape() {
        ImageIcon imageFood = new ImageIcon("src/Model/Image/apple.png");
        apple = imageFood.getImage();

    }
    public Image getShape() {
        return apple;
    }
}

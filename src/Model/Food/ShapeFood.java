package Model.Food;

import Model.Shape;

import javax.swing.*;
import java.awt.*;

public class ShapeFood implements Shape {
    public Image apple;

    @Override
    public void loadSnakeShape() {
        ImageIcon imageFood = new ImageIcon("scr/Model/Image/apple.png");
        apple = imageFood.getImage();

    }
}

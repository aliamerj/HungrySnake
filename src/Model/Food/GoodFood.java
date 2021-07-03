package Model.Food;


import Model.Snake.Snake;
import Model.Snake.SnakeShape;

import java.awt.*;

public class GoodFood extends Food {
    ShapeFood shapeFood = new ShapeFood();
    Snake snake;
    SnakeShape snakeShape;
    int addDote =1;

    public void FoodAffect() {

        if ((snake.snakeX[0] == getFood_X()) && (snake.snakeY[0] == getFood_Y())) {
            snakeShape.setDots(addDote++);
            locateFood();
        }
    }

    @Override
    public Image getShape() {
        return shapeFood.getShape();
    }

}

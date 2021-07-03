package Model.Food;

import Model.Snake.SnakeShape;

import java.awt.*;

public abstract class Food {

    private final int RAND_POS = 29;

    public int getFood_X() {
        return food_X;
    }

    public int getFood_Y() {
        return food_Y;
    }

    private int food_X;
    private int food_Y;



    public void locateFood() {
       var  snakeShape = new SnakeShape();

        int r = (int) (Math.random() * RAND_POS);
        food_X = ((r * snakeShape.DOT_SNAKE_SIZE));

        r = (int) (Math.random() * RAND_POS);
        food_Y = ((r * snakeShape.DOT_SNAKE_SIZE));
    }
     public abstract void FoodAffect();
    public abstract Image getShape();

}

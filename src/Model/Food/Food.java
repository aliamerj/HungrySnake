package Model.Food;

import Model.Snake.SnakeShape;

public abstract class Food {

    private final int RAND_POS = 29;
    public int food_X;
    public int food_Y;
    SnakeShape snakeShape ;


    public void locateFood() {

        int r = (int) (Math.random() * RAND_POS);
        food_X = ((r * snakeShape.DOT_SNAKE_SIZE));

        r = (int) (Math.random() * RAND_POS);
        food_Y = ((r * snakeShape.DOT_SNAKE_SIZE));
    }
     public abstract void FoodAffect();

}

package Model.Food;


import Model.Snake.Snake;
import Model.Snake.SnakeShape;

public class GoodFood extends Food {
    Snake snake;
    SnakeShape snakeShape;
    int addDote =1;

    public void FoodAffect() {

        if ((snake.snakeX[0] == food_X) && (snake.snakeY[0] == food_Y)) {
            snakeShape.setDots(addDote++);
            locateFood();
        }
    }

}

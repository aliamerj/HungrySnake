package Model;


public class GameRule  {
    SnakeShape snakeShape;
    Snake snake;


    // game over if the snake has hit the itself
    private void snakeHitItSelf(){
        for (int z = snakeShape.getDots(); z > 0; z--) {
            if ((z > 4) && hitItSelfX(snake.snakeX[z]) && hitItSelfY(snake.snakeY[z]))
            gameOver();

        }

    }
    // 1- upDown  y
    private boolean hitItSelfY(int current) {
        return snake.snakeY[0] == current;
    }
    // 2- rightLeft x
    private boolean hitItSelfX(int current) {
        return snake.snakeY[0] == current;
    }


    // game over if the snake has hit the walls
    private void snakeHitWalls(){
//        if (y[0] >= B_HEIGHT) {
//            inGame = false;
//        }
//
//        if (y[0] < 0) {
//            inGame = false;
//        }
//
//        if (x[0] >= B_WIDTH) {
//            inGame = false;
//        }
//
//        if (x[0] < 0) {
//            inGame = false;
//        }
        gameOver();
    }
    private void gameOver() {
        var GameOver = new GameOver(true);
    }

}


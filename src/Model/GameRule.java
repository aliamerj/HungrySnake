package Model;


import Model.Snake.Snake;
import Model.Snake.SnakeShape;

public class GameRule {
    SnakeShape snakeShape;
    Snake snake;
    Board board;
    private GameOver gameOver ;
    private initSnakeGame initSnakeGame;


    // game over if the snake has hit the itself
    public void snakeHitItSelf(){
        for (int z = snakeShape.getDots(); z > 0; z--) {
            if ((z > 4) && hitItSelfX(snake.snakeX[z]) && hitItSelfY(snake.snakeY[z]))
                gameOver.gameOver(true);

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
    public void snakeHitWalls(){
        if (snake.snakeY[0] >= board.boardHeight || snake.snakeY[0] < 0) {
            initSnakeGame.inGame = false;
        }

        if (snake.snakeX[0] >= board.boardWidth || snake.snakeX[0] < 0) {
            initSnakeGame.inGame = false;
        }


        if (initSnakeGame.inGame= false) {
            gameOver.gameOver(true);

        }
    }

}


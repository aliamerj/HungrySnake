package Model.Snake;

import Model.Board;
import Model.GameOver;

import javax.swing.*;
import java.awt.*;

public class Snake extends Board {
  private SnakeShape snakeShape ;

    protected boolean leftDirection = false;
    protected boolean rightDirection = true;
    protected boolean upDirection = false;
    protected boolean downDirection = false;


    public int[] snakeX = new int[snakeShape.getDOT_SNAKE_SIZE()];
    public int[] snakeY = new int[snakeShape.getDOT_SNAKE_SIZE()];

    public Snake() throws HeadlessException {
        initScreen();
    }

    public void initScreen() {
        add(new SnakeShape());
    }
    public void snakeLocation(){
        snakeShape.setDots(5);
        int dots = snakeShape.getDots();
        for (int i=0 ; i < dots ; i++){
            snakeX[i] = 50-i * 15;
            snakeY[i] = 50;
        }


    }
    //TODO :: MOVE method
    public void move() {

        for (int z = snakeShape.getDots(); z > 0; z--) {
            snakeX[z] = snakeX[(z - 1)];
            snakeY[z] = snakeY[(z - 1)];
        }

        if (leftDirection) {
            snakeX[0] -= snakeShape.getDOT_SNAKE_SIZE();
        }

        if (rightDirection) {
            snakeX[0] +=  snakeShape.getDOT_SNAKE_SIZE();
        }

        if (upDirection) {
            snakeY[0] -=  snakeShape.getDOT_SNAKE_SIZE();
        }

        if (downDirection) {
            snakeY[0] +=  snakeShape.getDOT_SNAKE_SIZE();
        }
    }
}

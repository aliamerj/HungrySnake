package Model.Snake;

import Model.Board;
import Model.GameOver;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {

  private SnakeShape snakeShape ;

    private final int ALL_DOTS = 900;


    protected boolean leftDirection = false;
    protected boolean rightDirection = true;
    protected boolean upDirection = false;
    protected boolean downDirection = false;

    public int[] snakeX = new int[ALL_DOTS];
    public int[] snakeY = new int[ALL_DOTS];

    public void snakeLocation() {
        var snakeShape = new SnakeShape();
        snakeShape.setDots(5);
        int dots = snakeShape.getDots();
        for (int i = 0; i < dots; i++) {
            snakeX[i] = 50 - i * 15;
            snakeY[i] = 50;
        }
    }




    //TODO :: MOVE method
    public void move(){

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

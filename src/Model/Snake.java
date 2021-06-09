package Model;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
  SnakeShape snakeShape;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;


    protected int[] snakeX = new int[snakeShape.getDOT_SNAKE_SIZE()];
    protected int[] snakeY = new int[snakeShape.getDOT_SNAKE_SIZE()];

    public Snake() throws HeadlessException {
        initScreen();
    }

    private void initScreen() {
        add(new SnakeShape());
    }
    private void snakeLocation(){
        snakeShape.setDots(5);
        int dots = snakeShape.getDots();
        for (int i=0 ; i < dots ; i++){
            snakeX[i] = 50-i * 15;
            snakeY[i] = 50;
        }
        var game = new GameOver(false);

    }
    //TODO :: MOVE method
    private void move() {

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

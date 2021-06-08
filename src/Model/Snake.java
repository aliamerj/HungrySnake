package Model;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
  SnakeShape snakeShape;


    private int[] snakeX = new int[snakeShape.getDOT_SNAKE_SIZE()];
    private int[] snakeY = new int[snakeShape.getDOT_SNAKE_SIZE()];

    public Snake() throws HeadlessException {
        initScreen();
    }

    private void initScreen() {
        add(new SnakeShape());
    }
    private void snakeLocation(){
        snakeShape.setDots(5);
        int dots = snakeShape.getDots();
        int DELAY = snakeShape.getDELAY();
        for (int i=0 ; i < dots ; i++){
            snakeX[i] = 50-i * 15;
            snakeY[i] = 50;
        }
        var timer = new Timer(DELAY, snakeShape);
        timer.start();

    }
    //TODO :: MOVE method 
}

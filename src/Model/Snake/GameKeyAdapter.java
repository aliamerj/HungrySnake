package Model.Snake;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyAdapter extends KeyAdapter {
    Snake snake;


    @Override
    public void keyPressed(KeyEvent event) {

        var rightDirection = snake.rightDirection;
        var leftDirection = snake.leftDirection;
        var upDirection = snake.upDirection;
        var downDirection = snake.downDirection;

        int key = event.getKeyCode();


        if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
            leftDirection = true;
            upDirection = false;
            downDirection = false;
        }

        if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
            rightDirection = true;
            upDirection = false;
            downDirection = false;
        }

        if ((key == KeyEvent.VK_UP) && (!downDirection)) {
            upDirection = true;
            rightDirection = false;
            leftDirection = false;
        }

        if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
            downDirection = true;
            rightDirection = false;
            leftDirection = false;
        }
    }
}

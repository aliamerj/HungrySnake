package Model;

import javax.swing.*;

public  class GameOver {
    SnakeShape snakeShape;
    int DELAY = snakeShape.getDELAY();

    public GameOver(boolean state) {
        var timer = new Timer(DELAY, snakeShape);
        if (!state)
        timer.start();
        else
            timer.stop();
    }
}

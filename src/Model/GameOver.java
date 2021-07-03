package Model;

import Model.Snake.SnakeShape;

import javax.swing.*;

public class  GameOver  {
   private initSnakeGame initSnakeGame;
    private final int DELAY = 140;

    public void gameOver(boolean state) {
        var timer = new Timer(DELAY, initSnakeGame);
        if ( state = false)
        timer.start();
        else
            timer.stop();
    }
}

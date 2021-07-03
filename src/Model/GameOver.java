package Model;

import Model.Snake.SnakeShape;

import javax.swing.*;

public  abstract class  GameOver  {
   private initSnakeGame initSnakeGame;
   private int DELAY = initSnakeGame.getDELAY();

    public void gameOver(boolean state) {
        var timer = new Timer(DELAY, initSnakeGame);
        if ( state = false)
        timer.start();
        else
            timer.stop();
    }
}

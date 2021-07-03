package Model.Snake;

import Model.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeShape extends Snake implements Shape {
    public final int DOT_SNAKE_SIZE = 10;
    private int dots;
    public final int ALL_DOTS = 900;
    public Image snakeShapeBody;
    public Image snakeShapeHead;

    private Timer timer;

    public void loadSnakeShape(){
        ImageIcon imageSnakeBody = new ImageIcon("src/Model/Image/dot.png");
        snakeShapeBody = imageSnakeBody.getImage();
        ImageIcon imageSnakeHead = new ImageIcon("scr/Model/Image/head.png");
        snakeShapeHead = imageSnakeHead.getImage();
    }
    public int getDOT_SNAKE_SIZE() {
        return DOT_SNAKE_SIZE;
    }

    public void setDots(int dots) {
        this.dots = dots;
    }
    public int getDots() {
        return dots;
    }


}

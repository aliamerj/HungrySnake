package Model.Snake;

import Model.Shape;

import javax.swing.*;
import java.awt.*;

public class SnakeShape extends Snake implements Shape {
    public final int DOT_SNAKE_SIZE = 10;
    private int dots;

    public Image snakeShapeBody;
    public Image snakeShapeHead;

    private Timer timer;

    public void loadShape(){
        ImageIcon imageSnakeBody = new ImageIcon("src/Model/Image/dot.png");
        snakeShapeBody = imageSnakeBody.getImage();
        ImageIcon imageSnakeHead = new ImageIcon("src/Model/Image/head.png");
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

    public Image getSnakeShapeBody(){
        return snakeShapeBody;
    }
    public Image getSnakeShapeHead(){
        return snakeShapeHead;
    }


}

package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeShape extends JFrame implements ActionListener {
    private final int DOT_SNAKE_SIZE = 15;

    private int dots;

    private final int DELAY = 140;

    private Image snakeShapeBody;

    private Image snakeShapeHead;

    private Timer timer;
    private void loadSnakeShape(){
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

    public int getDELAY() {
        return DELAY;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

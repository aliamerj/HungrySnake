package Model;

import Model.Food.Food;
import Model.Food.ShapeFood;
import Model.Snake.Snake;
import Model.Snake.SnakeShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class initSnakeGame extends JPanel implements ActionListener {
    private Snake snake;
    private GameOver gameOver;
    private Food food;
    public boolean inGame = true;
    private final int DELAY = 140;
    private ShapeFood shapeFood;
    private SnakeShape snakeShape;
    private Board board;
    private GameRule gameRule;

    private void initGame () {
        snake.snakeLocation();
        food.locateFood();


        gameOver.gameOver(false);


    }

    public int getDELAY() {
        return DELAY;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    private void doDrawing(Graphics g) {

        if (inGame) {

            g.drawImage(shapeFood.apple, food.food_X, food.food_Y, this);

            for (int z = 0; z < snakeShape.getDots(); z++) {
                if (z == 0) {
                    g.drawImage(snakeShape.snakeShapeHead, snake.snakeX[z], snake.snakeY[z], this);
                } else {
                    g.drawImage(snakeShape.snakeShapeBody, snake.snakeX[z], snake.snakeY[z], this);
                }
            }
            Toolkit.getDefaultToolkit().sync();
        }
        else gameOver(g);
        }

    private void gameOver(Graphics g) {
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (board.boardWidth - metr.stringWidth(msg)) / 2, board.boardHeight / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            food.FoodAffect();
            gameRule.snakeHitItSelf();
            gameRule.snakeHitWalls();
            snake.move();
        }
        repaint();

    }


}

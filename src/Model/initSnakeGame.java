package Model;

import Model.Food.Food;
import Model.Food.GoodFood;
import Model.Food.ShapeFood;
import Model.Snake.GameKeyAdapter;
import Model.Snake.Snake;
import Model.Snake.SnakeShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class initSnakeGame extends JPanel implements ActionListener {
    GameOver gameOver = new GameOver();
    Snake snake = new Snake();
    Food food = new GoodFood();
    ShapeFood shapeFood = new ShapeFood();
    SnakeShape snakeShape = new SnakeShape();

    public boolean inGame = true;

    private GameRule gameRule;
    private Shape shape;
    private Board board;


    private void initGame () {
        snake.snakeLocation();
        food.locateFood();
        gameOver.gameOver(false);


    }
    public  initSnakeGame() {

        initScreenPanel();

    }

    private void initScreenPanel() {
        var bo = new Board();
        Shape snakeShape = new SnakeShape();
        Shape foodShape = new ShapeFood();

        addKeyListener(new GameKeyAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(bo.getBoardWidth(), bo.getBoardHeight()));
        snakeShape.loadShape();
        foodShape.loadShape();
        initScreen();
    }

    public void initScreen() {
        snake.snakeLocation();
        food.locateFood();
        gameOver.gameOver(false);

    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }
    private void doDrawing(Graphics g) {


        if (inGame) {

            g.drawImage(shapeFood.getShape(), food.getFood_X(), food.getFood_Y(), this);

            for (int z = 0; z < snakeShape.getDots(); z++) {
                if (z == 0) {
                    g.drawImage(snakeShape.getSnakeShapeHead(), snake.snakeX[z], snake.snakeY[z], this);
                } else {
                    g.drawImage(snakeShape.getSnakeShapeBody(), snake.snakeX[z], snake.snakeY[z], this);
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

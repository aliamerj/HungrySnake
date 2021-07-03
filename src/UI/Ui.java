package UI;

import Model.Board;
import Model.Snake.Snake;
import Model.initSnakeGame;

import javax.swing.*;
import java.awt.*;

public class Ui extends JFrame {
    public Ui() {
        initUI();
    }

    private void initUI()  {

        add(new initSnakeGame());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new Ui();
            frame.setVisible(true);
        });

    }
}

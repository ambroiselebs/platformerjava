package main;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow() {
        setSize(500, 400);
        setResizable(false);
        setTitle("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}

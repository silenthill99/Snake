package fr.florian.snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = {GAME_UNITS};
    final int y[] = {GAME_UNITS};
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'R';

    GamePanel()
    {

    }

    public void startGame()
    {

    }

    public void paintComponent(Graphics g)
    {

    }

    public void draw(Graphics g)
    {

    }

    public void move()
    {

    }

    public void checkApple()
    {

    }

    public void  checkCollision()
    {

    }

    public void gameOver(Graphics g)
    {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}

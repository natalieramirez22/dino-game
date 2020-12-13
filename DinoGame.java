// Hack TJ main DinoGame class
// Natalie and Sarah

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DinoGame extends JFrame implements KeyListener
{
    public static final int FRAME_X = 800;
    public static final int FRAME_Y = 400;
    public static boolean gameRunning = false;

    private Dino dino;

    private JTextArea game;

    public static DinoGame window;
    
    public DinoGame()
    {
        dino = new Dino();
        game = new JTextArea();
        game.setBackground(Color.YELLOW);
        game.addKeyListener(this);
        this.add(game);
        game.setMinimumSize(new Dimension(FRAME_X, FRAME_Y));
        game.setBackground(Color.YELLOW);
        game.setMinimumSize(new Dimension(FRAME_X, FRAME_Y));


        setSize(FRAME_X, FRAME_Y);
        setTitle("dino xmas game");
        setBackground(Color.WHITE);
        setResizable(false);
        setAlwaysOnTop(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    @Override public void paint(Graphics g)
    {
        Dimension d = this.getSize();
        g.setColor(Color.darkGray);
        g.drawLine(0,d.height/2 + 100,d.width,d.height/2+100);
        g.drawRect(FRAME_X, FRAME_Y, FRAME_X, FRAME_Y);
        dino.draw(g);
    }

    public static void main(String[] args) 
    {
        window = new DinoGame();
    }

    @Override
    public void keyPressed(KeyEvent k) 
    {
        dino.jumpUp(k);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent k) 
    {
        dino.jumpDown(k);
        repaint();
    } 

    @Override
    public void keyTyped(KeyEvent k) {
    }   
}
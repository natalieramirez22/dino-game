// Hack TJ main DinoGame class
// Natalie and Sarah

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class DinoGame extends JFrame 
{
    public static final int FRAME_X = 800;
    public static final int FRAME_Y = 400;
    public static boolean gameRunning = false;

    private Dino dino;

    public static DinoGame window;
    //DinoGame.addKeyListener(this);
    
    public DinoGame()
    {
        dino = new Dino();
        setSize(FRAME_X, FRAME_Y);
        setTitle("dino xmas game");
        setBackground(Color.WHITE);
        setResizable(false);
        setAlwaysOnTop(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override public void paint(Graphics g)
    {
        Dimension d = this.getSize();
        g.setColor(Color.darkGray);
        g.drawLine(0,d.height/2 + 100,d.width,d.height/2+100);
        dino.draw(g);
    }

    /*
    private void display(KeyEvent k) {
        dino.jumpUp();
        //add a timer so that jumpDown is delayed
        dino.jumpDown();
    } */

    public static void main(String[] args) 
    {
        window = new DinoGame();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    @Override
    public void keyPressed(KeyEvent k) 
    {
        dino.jumpUp(k);
    }

    @Override
    public void keyReleased(KeyEvent k) 
    {
        dino.jumpDown(k);
    }

    @Override
    public void keyTyped (KeyEvent k) 
    {
       // comment
    }
}
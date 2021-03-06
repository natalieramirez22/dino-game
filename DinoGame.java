// Hack TJ main DinoGame class
// Natalie and Sarah

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DinoGame extends JFrame implements KeyListener, ActionListener
{
    public static final int FRAME_X = 800;
    public static final int FRAME_Y = 400;
    public static boolean gameRunning = false;

    private Dino dino;
    private static Trees tree1;
    private Trees[] trees;

    private JTextArea game;
    public static DinoGame window;
    int x = 300;
    
    public DinoGame()
     {
        dino = new Dino();
        //instantiate and fill tree array
        trees = new Trees[3];
        tree1 = new Trees(100);
        for(int i = 0; i < trees.length; i++) {
            trees[i] = new Trees(x);
            x += 200;
        }
        game = new JTextArea();
        game.setBackground(Color.WHITE);
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
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, FRAME_X, FRAME_Y);
        g.setColor(Color.darkGray);
        g.drawLine(0,d.height/2 + 100,d.width,d.height/2+100);
        dino.draw(g);
      //  tree1.draw(g);
        for(Trees tree: trees)
           tree.draw(g);
    }

    public void actionPerformed(ActionEvent e) {
        for(Trees tree: trees)
            tree.scroll();
        repaint();
    }

    public static void main(String[] args) 
    {
        window = new DinoGame();
        Timer clock = new Timer(8, window); //3
        clock.start();
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
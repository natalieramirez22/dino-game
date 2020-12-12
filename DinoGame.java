// Hack TJ main DinoGame class
// Natalie and Sarah

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

public class DinoGame extends JFrame 
{
    public static final int frameX = 800;
    public static final int frameY = 400;

    private Dino dino;

    public static DinoGame window;
    
    public DinoGame()
    {
        dino = new Dino();
        setSize(frameX, frameY);
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
        g.setColor(Color.lightGray);
        g.drawLine(0,d.height/2 + 100,d.width,d.height/2+100);
        dino.draw(g);
    }

    public static void main(String[] args) 
    {
        window = new DinoGame();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
}

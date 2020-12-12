// Hack TJ main DinoGame class
// Natalie and Sarah

import javax.swing.*;
import java.awt.Color;

public class DinoGame extends JFrame
{
    public static final int frameX = 800;
    public static final int frameY = 400;

    public static DinoGame window;
    
    public DinoGame()
    {
        setBounds(0, 0, frameX, frameY);
        setTitle("dino xmas game");
        setBackground(Color.WHITE);
        setResizable(false);
        setAlwaysOnTop(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        window = new DinoGame();
        window.setVisible(true);
    }
}

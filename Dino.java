// Hack TJ Dino Class

import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Dino extends DinoGame {
    
    private int xPos, yPos;
    //private ImageIcon dino;
    

    public Dino() {
        xPos = 200;
        yPos = 100;
        //dino = new ImageIcon("imgs/dino20%.jpg");
    }

    public void draw(Graphics g) {
//        g.drawImage(dino.getImage(), 100, 187, null);
    }
/*
    public void jumpUp(KeyEvent e) { //Key pressed method
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE)
            yPos += 50;
    }
 
    public void jumpDown(KeyEvent e) { //Key released method
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE)
            yPos -= 50;
    }
    */
} 
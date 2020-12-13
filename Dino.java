// Hack TJ Dino Class

import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Dino {
    
    private int xPos, yPos;
    private ImageIcon dino;

    public Dino() {
        xPos = 100;
        yPos = 170; //187
        dino = new ImageIcon("imgs/dinoNoGround.jpg");
    }

    public void draw(Graphics g) {
        g.drawImage(dino.getImage(), xPos, yPos, null);
    }

    public void jumpUp(KeyEvent e) { //Key pressed method
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE)
            yPos -= 150;
    }
 
    public void jumpDown(KeyEvent e) { //Key released method
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE)
            yPos += 150;
    }
/*
    public void jump(KeyEvent e) { //Key released method
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            yPos -= 150;
           // repaint();
            try
                {
                    Thread.sleep(1000);
                }
            catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
            yPos += 150;
        }       
} 
*/
}
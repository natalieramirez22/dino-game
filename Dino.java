// Hack TJ Dino Class

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Dino {
    
    private int xPos, yPos;
    private ImageIcon dino;

    public Dino () {
        xPos = 200;
        yPos = 100;
        dino = new ImageIcon("imgs/dino.jpg");
        System.out.println(dino.getImage());
    }

    public void draw (Graphics g) {

        g.drawImage(dino.getImage(), 200, 100, null);
    }

    public void jump () {
        yPos += 50;

        yPos -= 50;
    }
}

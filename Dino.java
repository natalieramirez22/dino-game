import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Dino {
    
    private int xPos, yPos;
    public static ImageIcon dino = new ImageIcon("dino.jpg");

    public Dino () {
        xPos = 200;
        yPos = 100;
    }

    public static void draw (Graphics g) {

        g.drawImage(dino.getImage(), 200, 100, null)
    }

    public void jump () {
        yPos += 50;
        yPos -= 50;
    }
}

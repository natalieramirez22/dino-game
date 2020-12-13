/* HackTJ Dino Game
 Method to move trees across the background */
 
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Trees {
 
   private int xPos, yPos;
   private ImageIcon tree1;

   Trees(int x) {
      xPos = x;
      yPos = 230; //180
      tree1 = new ImageIcon ("imgs/treeSmall.jpg");

   }
   
   public void draw (Graphics g) {
    //  for(int i = 0; i < trees.length; i++)
     //    g.drawImage(trees[i].getImage(), 200, 100, null);
     g.drawImage(tree1.getImage(), xPos, yPos, null);
    // g.drawImage(tree2.getImage(), xPos, yPos, null);
    // g.drawImage(tree3.getImage(), xPos, yPos, null);
  }


   public void scroll (){
         xPos-=2; //If you want trees to stop put at -= 0 or just xPos // for end game situation
         if (xPos <0)
            xPos = 800; 
   }
}
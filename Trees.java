/* HackTJ Dino Game
 Method to move trees across the background */
 
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Trees extends DinoGame{
 
   private int xPos, yPos;
   private static ImageIcon[] trees = new ImageIcon[4];

   Trees(int x) {
      xPos = x;
      yPos = 180;
      for(int i = 0; i < trees.length; i++)
         trees[i] = new ImageIcon("imgs/trees.jpg");
   }
   
   public static void draw (Graphics g) {
      for(int i = 0; i < trees.length; i++)
         g.drawImage(trees[i].getImage(), 200, 100, null);
  }

/*  private void createJumpTimer() {
   Timer treeTimer = new Timer (250,
  
  /* new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
         dino.jumpDown();
         repaint();
         jumpTimer.stop();
      }
   }
   
}
  */ 
   public void scroll (){
      while (gameRunning = true) {
         xPos--;
         if (xPos <0)
            xPos = 800;
      }
      
   }
 
}
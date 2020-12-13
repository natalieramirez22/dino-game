/* HackTJ Dino Game
 Method to move trees across the background */
 
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Trees {
 
   private int xPos, yPos;
   private ImageIcon tree1;
   private ImageIcon tree2;
   private ImageIcon tree3;
  // private static ImageIcon[] trees = new ImageIcon[4];

   Trees(int x) {
      xPos = x;
      yPos = 230; //180
    //  for(int i = 0; i < trees.length; i++)
    //     trees[i] = new ImageIcon("imgs/tree.jpg");
     tree1 = new ImageIcon("imgs/treeSmall.jpg");
     tree2 = new ImageIcon("imgs/treeSmall.jpg");
     tree3 = new ImageIcon("imgs/treeSmall.jpg");

   }
   
   public void draw (Graphics g) {
    //  for(int i = 0; i < trees.length; i++)
     //    g.drawImage(trees[i].getImage(), 200, 100, null);
     g.drawImage(tree1.getImage(), xPos, yPos, null);
     g.drawImage(tree2.getImage(), xPos, yPos, null);
     g.drawImage(tree3.getImage(), xPos, yPos, null);
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
         xPos-=2; //If you want trees to stop put at -= 0 or just xPos // for end game situation
         if (xPos <0)
            xPos = 800; 
   }
}
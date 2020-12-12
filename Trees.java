/* HackTJ Dino Game
 Method to move trees across the background */
 
public class Trees extends DinoGame{
 
   Trees tree1 = new Trees();
   private int xPos, yPos;
   
   public void scroll (){
      while (gameRunning == true) {
         xPos--;
         if (xPos <0)
            xPos = 800;
      }
      
      
   }
 
}

import java.util.Random;

public class Ram extends CharEntities{
      private int health;
      private int attack;
      private int level;
      public static Random rand = new Random();

      public Ram(Protag pc){
    	  int enemy = pc.getLevel();
    	  setLevel(enemy);
          setAttack();
          setHealth();
      }
      public void enemy(){
    	  System.out.println("                   _.-..");
          System.out.println("                 ,'9 )\\)`-.,.--.");
          System.out.println("                 `-.|           `.");
          System.out.println("                     \\,      ,    \\)");
          System.out.println("                      `.  )._\\   (\\");
          System.out.println("                       |//   `-,//");
          System.out.println("                       ]||    //\"");
          System.out.println("                       \"\"    \"\"");
       }
      public void setLevel(int enemy) {
    	  
    	  level = (rand.nextInt(4) + 1) * enemy;
      }
      public void setAttack() {
    	  
    	  attack = 5*level;
      }
      public void upAttack(int boost) {
    	  
    	  attack = attack + boost;
      }
      public void setHealth() {
    	  
    	  health = 4*level;
      }
      
      public int getLevel() {
    	  return level;
      }
      public int getMove(Protag pc){
          int move = rand.nextInt(4);
          int dam = 0;
          if(move == 0) {
        	  System.out.println("Ram smashes his Horns into the wall");
        	  dam = 0;
        	  System.out.println("It's attack increased.");
        	  System.out.println("Attack " + getAttack() + "-->");
        	  upAttack(getAttack()/2);
        	  System.out.print(getAttack()+ "\n");
          }else if(move == 1) {
        	  System.out.println("Ram uses Head Smash");
        	  dam = attack*2;
        	  System.out.println("It's a critical");
          }else if(move == 2 || move == 3) {
        	  System.out.println("Ram uses Tackle");
        	  dam = attack;
          }
          return dam;
    	  
      }
      public int getAttack(){
            return this.attack;
      }

      public void intro() throws InterruptedException {
            Main.sleep500();
            Thread.sleep(1000);
            System.out.println("\n\nA Ram appeared!");
            System.out.println("Level: " + getLevel());
            System.out.println("Health: " + getHealth());
      }

      public int getHealth(){
            return this.health;
      }
      public void damage(int hurt) {
    	  health = health - hurt;
      }
}

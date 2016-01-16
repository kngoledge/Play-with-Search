import java.util.Random;

public class Tester
{
    public static void main(String args[])
    
    {
       //computer generates random number
       
       Random rand = new Random();
       int r = rand.nextInt(1024) + 1; 
       
       game myGameObj = new game();
       System.out.println(myGameObj.compareNumR(1, r));
   }
}

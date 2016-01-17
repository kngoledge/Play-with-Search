import java.util.Random;

public class compTester
{
    public static void main(String args[])
    
    {
       //computer generates random number and plays game 100 times
       for (int j=0; j<100; j++)
       {
           int max=1024;
           //maximum number of attempts will  be 10 because 2^10 = 1024 (see Readme)
           int min=1;
           Random rand = new Random();
           int r = rand.nextInt(max-min+1) + min; 
           
           computergame myGameObj = new computergame();
           System.out.println(myGameObj.compCompareNumR(1, min, max, r));
       }
    }
}

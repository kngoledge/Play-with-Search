//computer chooses and guess number

import java.io.*;
import java.util.*;

public class computergame
{
    public String compCompareNumR(int i, int min, int max, int genNumR)
    {
        
        //System.out.print("Guess what integer x is: ");
        int compGuess = (int)((max+min)/2);
        //System.out.println(compGuess);
        if (genNumR == compGuess)
        {
            //System.out.println("I guessed correctly.");
            return "Attempts: " + i;
        }
        else if (genNumR < compGuess)
        {
            
            //System.out.println("x is smaller.");
            max = compGuess-1;
            return compCompareNumR(i+1, min, max, genNumR);
        }
        else
        {
            
            //System.out.println("x is larger");
            min = compGuess+1;
            return compCompareNumR(i+1, min, max, genNumR);
            
        }
        
    }
}

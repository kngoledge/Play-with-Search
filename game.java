//computer asks for user input and uses recursion to see if the guess is smaller/larger

import java.io.*;
import java.util.*;

public class game
{
    public String compareNumR(int i, int genNumR)
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Guess what integer x is: ");
        int yourGuess = kbReader.nextInt();
        
        if (genNumR == yourGuess)
        {
            System.out.println("You guessed correctly.");
            return "Attempts: " + i;
        }
        else if (genNumR < yourGuess)
        {
            
            System.out.println("x is smaller.");
            return compareNumR(i+1, genNumR);
        }
        else
        {
            
            System.out.println("x is larger");
            return compareNumR(i+1, genNumR);
        }
        
    }
}

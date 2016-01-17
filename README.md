How to Use
=============================
Tester.java requires the game class in game.java. This program generates a random number c between 1 (inclusive) and 1024 (inclusive). The user guesses the number and the program will inform the user if x is larger or smaller. The program prints out the number of attempts.
computergame.java and compTester.java are similar excepts that the program chooses and guesses the number.


Binary Search and Attempts Output
=============================
With computergame.java, the number of attempts can be any number greater or equal to 1, unless the user is using the binary search method, in which case the  maximum attempts will be 11. 


Since the number range is 1 (inclusive) to 2^10 (inclusive), computergame.java will take 1 to 11 attempts to correctly guess the number. 


If the randum number range is consecutive integers 1 (inclusive) to 2^n (inclusive), the maximum attempts is n+1.


However, if the number range is consecutive integers 1 (inclusive) to 2^n (exclusive), the maximum number of attempts is n.


Why:
----

Let's say we have a number range of integers from 1 (inclusive) to 4 or 2^2 (inclusive). 


In this scenerio, the computer generated random number is 4.


int c = 4


If we use binary search, the first number to be guessed is 2 (since the average of 1 and 4 is 2.5 and we round down).


int g = 2


c > g, so the new number range that the program in computergame.java will use to calculate its guess is from 3 (inclusive) to 4.
The program will guess 3 next (since the average of 3 and 4 is 3.5 and we round down).


g += 1


The program's last guess will be 4, since 4 is the only number in the given range that is greater than 3.


g += 1


Now, 


g == c


Attempts: 3. 


This works when the the number range is full of integers, the maximum number range is 2 to any power, and the maximum is inclusive.
If the maximum is exclusive, the largest possible computer generated random number is 3, and the program would use at most 2 attempts to guess 3. 


So if we have a number range of consecutive integers from 1 (inclusive) to 1024 or 2^10 (inclusive), the maximum number of attempts is 11.

If we have a number range of integers from 1 (inclusive) to 2048 or 2^11 (exclusive), the number number of attempts is also 11.


It makes sense because binary search splits the set of numbers to get the average. Therefore, the maximum number of attempts, whether the maximum is inclusive or exclusive, is related to how many times the original set of numbers can be split into two.
 

What happens if the number range minimum is not 1?
----------------------------------------------
For example, what is the total possible number of attempts when the number range is composed of consecutive integers from 2 to 1024 (or 2^n where n =10).


In that case, the total possible attempt is n, or 10 regardless of whether or not 1024 is inclusive or exclusive.


This stays true as long as the minumum is less than or equal to 2^(n-1), which is in this case 512.


Therefore total possible attempts for 66 to 1024 (inclusive) is 10.


Likewise, the total possible attempts for 66 to 1024 (exclusive) is 10.






How to Use
=============================
Tester.java requires the game class in game.java. This program generates a random number x between 1 and 1024. The user guesses the number and the program will inform the user if x is larger or smaller. The program prints out the number of attempts.
computergame.java and compTester.java are similar excepts that the program chooses and guesses the number.

Binary Search and Attempts Output
=============================
With computergame.java, the number of attempts can be any number greater or equal to 1, unless the user is using the binary search method, in which case the  maximum attempts will be 10. 

Since the number range is 1 to 2^10, computergame.java will take 1 to 10 attempts to correctly guess the number. 
If the randum number range is 2^n, the maximum attempts is n.

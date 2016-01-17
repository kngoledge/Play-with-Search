# Play-with-Search
1) Program chooses a random number between 1 and 1024 (or any powers of two, 2^n) with approximately equal probability.

2) User guesses it and the program tells if the answer is larger or smaller than the guess.

3) Repeat "2)" until user guesses right. Then print the number of attempts.

4) Repeat 1-3) this 10 times and record number of attempts.

5) Modify the program so that the computer will choose AND guess the number.

6) Run "5)" N>=100 times and record number of attempts.

7) Improve search algorithm, and use recursion. (read up on binary search algorithm for example)

8) Write-up to interpret "4)" and "6)" - this result will depend on the search algorithm. With your algorithm, try to explain how many guess do you need to make to get the correct answer. (Hint: If the random number range is 2^n instead of 1024=2^10, what would be the result? Do you see a pattern?)

Files game.java and Tester.java are together and need the other to run. Similar for computergame.java and compTester.
For 

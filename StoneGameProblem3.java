1 - Stone Game
Alex and Lee play a game with piles of stones. There are an even number of piles arranged in a
row, and each pile has a positive integer number of stones piles[i].
The objective of the game is to end with the most stones. The total number of stones is odd, so
there are no ties.
Alex and Lee take turns, with Alex starting first. Each turn, a player takes the entire pile of
stones from either the beginning or the end of the row. This continues until there are no more
piles left, at which point the person with the most stones wins.
Assuming Alex and Lee play optimally, return True if and only if Alex wins the game.

Example 1:
Input: [5,3,4,5]
Output: true
Explanation:
Alex starts first, and can only take the first 5 or the last 5.
Say he takes the first 5, so that the row becomes [3, 4, 5].
If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
This demonstrated that taking the first 5 was a winning move for Alex, so we return true.
Note:
1. 2 <= piles.length <= 500
2. piles.length is even.
3. 1 <= piles[i] <= 500
4. sum(piles) is odd.

Step 1 Define the problem:the problem is asking to get the most piles of stones.the user can only get the front or last pile of rocks
whom ever get the most point wins in this case alex wins for the simple reason he got the first place.
if the pile is odd then it just one pile which it has to be less than or equal to 500.Lets say the array is [6,4,3] would the second player
outomatic lose?.
  Step 2 before starting to code lets break the problem down into smaller ones: 
  for(read the array){
   User can take [5,    ,5] the first pile or the last 
     if(user pick index 0 || index 3 )  //in this case the last index is 3
        then updated the array [3,4,5] || [5,3,4]
       array[i] = i + 1;
    store player one points = n;
    store player two points = n; //because he hasnt got any points
  }
another solution can be ones the first player chose the pile updated the array then read the array again
 for(read the updated array )
   //player two can now get the piles of the stones
      [5,3,4] || [3,4,5]
      player two can chose 
      if(player chosed the piles )
        array[i] = i + 1;//updated array and store points 
        player one n points 
        player two n points
  }
  the game will continue till  ones a players hits null then it will return 
  the sum of the player points 
  if (Player One has greater point than player Two || Player Two > player One )
    then return or print who one 

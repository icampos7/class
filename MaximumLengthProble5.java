Maximum Length of Pair Chain

You are given n pairs of numbers. In every pair, the first number is always smaller than the
second number.
Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be
formed in this fashion.
Given a set of pairs, find the length longest chain which can be formed. You needn't use up all
the given pairs. You can select pairs in any order.
Example 1:
Input: [[1,2], [2,3], [3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4]
Note:
1. The number of given pairs will be in the range [1, 1000].

n pair of numbers,the first num has to be smaller then the second so if first num is 3 and second num
is 2 then the code will show a error. (c,d) , (a,b) if b< c b has as to be least than the next one to 
pair chairs 
One way we can do it is by sorting the numbers this way we cant encounters problems 
if a = 1, b = 2 , c = 3, d = 4 -> then the numbers (a,b),(c,d); Step 1 : sort The array 
then a for() read the numbers  another one to read again 
  then if we already sorted the array then we can just count how many chain were made 
  countPair++ 
   
  ones the last number hits then we return and count the pairs 
  (int[][] pairs){
    Array.sort(pairs)
    we sort the array first the we check the forloop
    for(...; i<pairs.length; i++)
      for(.. start at 1; j<pairs[i].length; i++)
      if therir any negative numbers or it hit a [1,2] , [3, empty space]
       the we dont count the pair 
       count++;
        count = pairs + 1;
        return the numbers that are pairs 

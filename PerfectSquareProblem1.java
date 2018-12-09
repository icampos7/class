//final question 1:
//Question:
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9,
16, ...) which sum to n.
Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.

step1, Define the problem:in this case the problem is asking to find the least number of
perfect square.If the array is [1,4,9,16] if the user is inputing n then the code should
travers to each number that adds up to n.In this case example 1 : is 12 and the numbers 
that add up is 4 + 4 + 4 
break down the problem to smaller ones: first try with a smaller array 
  for(read the array one's)
    for(reads the array again but starts doing equations)
    if(n % 2 == 0)
    what ever the user input it will divide 2 till it hits zero then it will count how
    many numbers were used
    print(numbers were used)

code:
public static int PerfectSquare(int[] array, int n){
  int sum;
  int count = 0;
  int i = 0;
    for(i = 0; i<array.length; i++){
      for(int j = 0; j<array.length; j++){
        if(n%2==0)
          count++
          print(n);
      }
  }
}

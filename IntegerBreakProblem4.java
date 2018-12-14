Given a positive integer n, break it into the sum of at least two positive integers and maximize
the product of those integers. Return the maximum product you can get.
Example 1:
Input: 2
Output: 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.
Example 2:
Input: 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
Note: You may assume that n is not less than 2 and not larger than 58.
  Case 1 : what if the integer is a negative then the maximize could be 
  -1 + -1, however in this problem it only asking for positive int n ;
Step 2 : store the integer on a 1D array [10]
compute the sum and product
  
  
  
Step 1 Define the problem:The problem is asking to get the max product of the input 
if the input was 4 
the n it would be 4 = 2+2,2*2 = 4 so the max product can be 4 
first we ask are self is this an array? or is it safe to assume it just integers.
first get the user input 
let say it -1 then if thats the case the code should 
return null or 0;
after we should get the max numbers 
Step 2 check if i can break the problem : first lets solve how to read the num
  for(...; i<num;...);
    while (the num >= 1 ) the this will check every single number thats greater than 1 
      
      then we read again starting from 1
      for(int j = 1;...; j++)
        this will addd and multiply the num[i]
          addnum += i;
          mulnum *= i-j;

//the method should return 
static int PerfectSquare(int num){
    for(int i = 0; i<= num; i++){//check the numbers 
       while(numbers is not -1)
          then we check the num       
            for(int j = 1; i<=num; j++
                saveAns+= i;
                mulnum *= i-j
                
               // return add

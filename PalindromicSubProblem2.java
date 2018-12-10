Given a string, your task is to count how many palindromic substrings in this string.
The substrings with different start indexes or end indexes are counted as different substrings
even they consist of same characters.
Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
Note:
1. The input string length won't exceed 1000.
 //
step 1 Define the problem : The problem is asking to count how many palindromes are in a
substring if any letters repeat then count them as well one of the possible solution is
doing a counter.First we start by reading the string/substring  we will let N be the length
of the String
for(i = 0; i< N; i++) check how long the string is,after lets count the String 
countLetters++ ,if(n is greater than 1000 then) return the string is to big.
 this can be one of the solutions after this the counter can be save to another variable 
 
 static int countString(String n){
   
   for(int i = 0; i < n.length; i++){
     
     if(n>1000)
     s.o.p("to big")
   }  
   for(int i = 0; i<n){
   count++;
 return count;
 }

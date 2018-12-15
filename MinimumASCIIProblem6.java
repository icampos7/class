Minimum ASCII Delete Sum for Two Strings

Given two strings s1, s2, find the lowest ASCII sum of deleted characters to make two strings
equal.
Example 1:
Input: s1 = "sea", s2 = "eat"
Output: 231
Explanation: Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.
Deleting "t" from "eat" adds 116 to the sum.
At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.
Example 2:
Input: s1 = "delete", s2 = "leet"
Output: 403
Explanation: Deleting "dee" from "delete" to turn the string into "let",
adds 100[d]+101[e]+101[e] to the sum. Deleting "e" from "leet" adds 101[e] to the sum.
At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.
Note:
0 < s1.length, s2.length <= 1000.
All elements of each string will have an ASCII value in [97, 122].


Step 1 Define the problem what does the problem : In this problem its asking to use ASCII table to 
make two string be equal to each other by deleting and adding the letter to be equal to each other.

case 1 : check the string if the string has similiar letters then check which ones are not similiar
example " sea ", " eat " case 1 should delete 's' which will be 115 -> in this case we will be adding
't' ->this will be s1 = eat,s2 = eat and the output is 231 the only thing is the string cannot <= 1000 

step2 One solution to this problem is to store the inputs 
onto a seperate array this way {"sea"},{"eat"} this way we can compare both array

if case 1 happens then we can use ASCII table -> for(read the string){
  for(read the string){
  }
}
onces we read the string we can convert to char -> ['s','e','a'],['e,'a','t'] or s2 we can delete 't'
and add 's' at the end or s1 can be eat then we add char to the word 't' || 's'
then we sum to find the total 


for(int i = 0; i<s1.length(); i++)
  for(int i = 1; i<s1.length(); i++)
  
 
for(int i = 0; i<s2.length(); i++)
  for(int i = 1; i<s2.length(); i++)
  
  if(s1 != s2)
  then we check an remove char to either one
  if(s1== s1)
    return true;
  







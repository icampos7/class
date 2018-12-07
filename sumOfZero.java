Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Note:
The solution set must not contain duplicate triplets.
Example:
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
Step 1:Analyse the problem and see what is the problem asking, 
in this case this problem this problem confuse me one of the question I would ask is “should numbers for example -1 + 0  +1 = 0 should you use the same number when you are trying new values in this case 1 + 2 + -1 ” “what should be the time complexity ” “should I sort the array”

Step 2: use I: identify the problem, what is the problem asking me to do and what does it mean. in this case the problem is asking to sum three numbers in the array however I doesn’t say the numbers can repeat.

            D: what does the problem mean? In this case the problem is asking to add three numbers from the array that equals to zero.
            
            E: Explore every possible solution, for example breaking the problem into smaller solution and explore every single problem,
            in this problem I can break it into smaller one by first identifying to traverse the array one by one to see if any numbers repeat, 
            check if there exactly three numbers. Second how to add three numbers and go the next one, how to print the numbers they used.
            
            A: Anticipate Outcomes what would be the input’s if the user try different ones would my code still work. What if the input was [-10,0]? Will it work 

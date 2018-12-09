Invert a binary tree.
Example:
Input:
     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:
     4
   /   \
  7     2
 / \   / \
9   6 3   1

Step 1 question to ask: "what is the time complexity " "am i allow to uses any libarys "
"what if the binary tree is null"
  Step 2: use IDEAL to break the problem into smaller ones,In this case the problem is
  asking to inver the  binary true,however it doesn't if one of the sides is null.One 
  of the possible solution is to try to invert a binary tree with less values.what would 
  be the outcome if the binary tree is null. or one side has more numbers than the other  
     4
   /   \
  2     null
 / \   / \
1   3 6   9

  4
   /   \
  2     7
 / \   
1   3 

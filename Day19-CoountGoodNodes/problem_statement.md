# Day 19 of LeetCode 75: Count Good Nodes in Binary Tree
Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.<br>

Return the number of good nodes in the binary tree.<br>

### Example 1:
Input: root = [3,1,4,3,null,1,5]<br>
Output: 4<br>
Explanation: Nodes in blue are good.<br>
Root Node (3) is always a good node.<br>
Node 4 -> (3,4) is the maximum value in the path starting from the root.<br>
Node 5 -> (3,4,5) is the maximum value in the path<br>
Node 3 -> (3,1,3) is the maximum value in the path.<br>

### Example 2:
Input: root = [3,3,null,4,2]<br>
Output: 3<br>
Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.<br>

### Example 3:
Input: root = [1]<br>
Output: 1<br>
Explanation: Root is considered as good.<br>
 

## Constraints:
The number of nodes in the binary tree is in the range [1, 10^5].<br>
Each node's value is between [-10^4, 10^4].<br>

## Answer Approach:
For solving this problem, using DFS starting from the root and keep track of the maximum value seen so far on the path. At each node, if its value is greater than or equal to this maximum, count it as a good node. Recursively check the left and right children while updating the maximum value. Finally, return the total count of good nodes.
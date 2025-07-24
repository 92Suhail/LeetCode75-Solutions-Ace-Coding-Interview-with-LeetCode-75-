# Day 18 of LeetCode 75: Rotting Oranges

You are given an m x n grid where each cell can have one of three values:<br>

0 representing an empty cell,<br>
1 representing a fresh orange, or<br>
2 representing a rotten orange.<br>
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.<br>

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.<br>

### Example 1:
Input: grid = [[2,1,1],[1,1,0],[0,1,1]]<br>
Output: 4<br>

### Example 2:
Input: grid = [[2,1,1],[0,1,1],[1,0,1]]<br>
Output: -1<br>
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.<br>

### Example 3:
Input: grid = [[0,2]]<br>
Output: 0<br>
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.<br>
 

## Constraints:
m == grid.length<br>
n == grid[i].length<br>
1 <= m, n <= 10<br>
grid[i][j] is 0, 1, or 2.<br>

## Answer Approach:
Firstly starts by adding all initially rotten oranges to a queue and counting the number of fresh oranges. At each minute (BFS level), it processes all rotten oranges in the queue, rotting any adjacent fresh ones and adding them to the queue. This continues until no more fresh oranges can be rotted. If all fresh oranges are rotted, the total minutes taken is returned; otherwise, if some remain unreachable, -` is returned.
<br>
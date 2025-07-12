# Day 13 of LeetCode 75: Reorder Routes to Make All Paths Lead to the City Zero

There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.<br>

Roads are represented by connections where connections[i] = [ai, bi] represents a road from city ai to city bi.<br>

This year, there will be a big event in the capital (city 0), and many people want to travel to this city.<br>

Your task consists of reorienting some roads such that each city can visit the city 0. Return the minimum number of edges changed.<br>

It's guaranteed that each city can reach city 0 after reorder.<br>

 

### Example 1:
Input: n = 6, connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]<br>
Output: 3<br>
Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).<br>

### Example 2:
Input: n = 5, connections = [[1,0],[1,2],[3,2],[3,4]]<br>
Output: 2<br>
Explanation: Change the direction of edges show in red such that each node can reach the node 0 (capital).<br>

### Example 3:
Input: n = 3, connections = [[1,0],[2,0]]<br>
Output: 0<br>
 

## Constraints:

2 <= n <= 5 * 104<br>
connections.length == n - 1<br>
connections[i].length == 2<br>
0 <= ai, bi <= n - 1<br>
ai != bi<br>

## Answer Approach:
For solving this question, we starting DFS from city 0. For every edge, it checks if the road leads away from the current node, if so, it counts it as a needed reversal. By traversing all nodes and summing the number of such reversals, we computes the minimum number of edges that must be reversed to ensure all cities can reach city 0.<br>

# Day 12 of LeetCode 75: Number of Provinces
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.<br>

A province is a group of directly or indirectly connected cities and no other cities outside of the group.<br>

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.<br>

Return the total number of provinces.<br>

 

### Example 1:
Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]<br>
Output: 2

### Example 2:
Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]<br>
Output: 3
 

## Constraints:

1 <= n <= 200<br>
n == isConnected.length<br>
n == isConnected[i].length<br>
isConnected[i][j] is 1 or 0.<br>
isConnected[i][i] == 1<br>
isConnected[i][j] == isConnected[j][i]0

## Answer Approach:
For solving this problem, Using Depth-First Search (DFS) to traverse all cities reachable from a given unvisited city, marking them as visited. Each time we start a DFS from an unvisited city, it means we've found a new province, so we increment our province counter. By the end of the traversal, the counter represents the total number of provinces.

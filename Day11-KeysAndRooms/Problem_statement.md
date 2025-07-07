# Day 11 of LeetCode 75: Keys and Rooms

There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.<br>

When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.<br>

Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.<br>

 

### Example 1:
Input: rooms = [[1],[2],[3],[]]<br>
Output: true<br><br>
Explanation: <br>
We visit room 0 and pick up key 1.<br>
We then visit room 1 and pick up key 2.<br>
We then visit room 2 and pick up key 3.<br>
We then visit room 3.<br>
Since we were able to visit every room, we return true.<br>

### Example 2:
Input: rooms = [[1,3],[3,0,1],[2],[0]]<br>
Output: false<br><br>
Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.<br>
 

### Constraints:

n == rooms.length<br>
2 <= n <= 1000<br>
0 <= rooms[i].length <= 1000<br>
1 <= sum(rooms[i].length) <= 3000<br>
0 <= rooms[i][j] < n<br>
All the values of rooms[i] are unique.<br>

### Answer Approach: (Using Depth-First Search)
Firslty maintains a visited boolean array named visitor to track which rooms have been accessed. Starting from room 0, it recursively explores each reachable room using the keys found inside them. After the DFS traversal, it checks if all rooms are marked as visited, returning true if so; otherwise, it returns false, showing that some rooms are still inaccessible.

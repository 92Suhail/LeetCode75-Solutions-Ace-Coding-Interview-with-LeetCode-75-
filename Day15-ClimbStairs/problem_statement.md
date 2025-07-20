# Day 15 of LeetCode 75: Min Cost Climbing Stairs
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.<br>
You can either start from the step with index 0, or the step with index 1.<br>
Return the minimum cost to reach the top of the floor.<br>

 

### Example 1:
Input: cost = [10,15,20]<br>
Output: 15<br>
Explanation: You will start at index 1.<br>
- Pay 15 and climb two steps to reach the top.<br>
The total cost is 15.<br>

### Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]<br>
Output: 6<br>
Explanation: You will start at index 0.<br>
- Pay 1 and climb two steps to reach index 2.<br>
- Pay 1 and climb two steps to reach index 4.<br>
- Pay 1 and climb two steps to reach index 6.<br>
- Pay 1 and climb one step to reach index 7.<br>
- Pay 1 and climb two steps to reach index 9.<br>
- Pay 1 and climb one step to reach the top.<br>
The total cost is 6.<br>
 

## Constraints:
2 <= cost.length <= 1000<br>
0 <= cost[i] <= 999<br>


## Answer Approach:(Using DP)
Firstly create an array to keep track of the minimum cost to reach each step. Then start with step 0 and step 1 having zero cost since we can start from either. Then we go through the rest of the steps, calculating the cheapest way to get to each one. In the end, we return the cost to reach just past the last step, which is the top of the floor.

# Day 16 of LeetCode 75: House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.<br>

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.<br>


 

### Example 1:
Input: nums = [1,2,3,1]<br>
Output: 4<br>
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).<br>
Total amount you can rob = 1 + 3 = 4.<br>

### Example 2:
Input: nums = [2,7,9,3,1]<br>
Output: 12<br>
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).<br>
Total amount you can rob = 2 + 9 + 1 = 12.<br>
 

## Constraints:
1 <= nums.length <= 100<br>
0 <= nums[i] <= 400<br>


## Answer Approach: (using DP)
Firstly create a dp array where each element represents the maximum money that can be robbed up to that house. For each house, we either take the money from robbing it plus the value two houses back (dp[i-2] + nums[i]), or skip it and take the previous max (dp[i-1]). We pick the higher of the two. The final value in the array gives the maximum amount that can be robbed without triggering the alarm.
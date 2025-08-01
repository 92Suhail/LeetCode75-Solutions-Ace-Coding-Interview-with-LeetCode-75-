# Day 4 of LeetCode 75: Kids With the Greatest Number of Candies

🔹 Problem: There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have. <br/>

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise. <br/>

Note that multiple kids can have the greatest number of candies.<br/>

## Example 1:
Input: candies = [2,3,5,1,3], extraCandies = 3<br/>
Output: [true,true,true,false,true] <br/>
Explanation: If you give all extraCandies to:<br/>
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.<br/>
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.<br/>
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.<br/>
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.<br/>
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.<br/>

## Example 2:
Input: candies = [4,2,1,1,2], extraCandies = 1<br/>
Output: [true,false,false,false,false] <br/>
Explanation: There is only 1 extra candy.<br/>
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.<br/>

## Example 3:
Input: candies = [12,1,12], extraCandies = 10<br/>
Output: [true,false,true]<br/>


## Constraints:

n == candies.length<br/>
2 <= n <= 100<br/>
1 <= candies[i] <= 100<br/>
1 <= extraCandies <= 50<br/>


## 🔹 Answer Approach:
First, find the maximum number of candies any kid currently has. Then, for each kid, check if giving them all the extraCandies makes their total greater than or equal to that maximum. If yes, add true to the result list; otherwise, add false. Return the result list.

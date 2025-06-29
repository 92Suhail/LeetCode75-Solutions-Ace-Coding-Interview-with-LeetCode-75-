# Day 8 of LeetCode 75: Increasing Triplet Subsequence

Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.<br>

 

### Example 1:
Input: nums = [1,2,3,4,5]<br>
Output: true<br>
Explanation: Any triplet where i < j < k is valid.<br>

### Example 2:
Input: nums = [5,4,3,2,1]<br>
Output: false<br>
Explanation: No triplet exists.<br>

### Example 3:
Input: nums = [2,1,5,0,4,6]<br>
Output: true<br>
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.<br>
 

### Constraints:

1 <= nums.length <= 5 * 105<br>
-231 <= nums[i] <= 231 - 1<br>


### Answer Approach:
For solving this problem i maitained 2 variables named one and two that is initialized as Integer.MAX_VALUE to tracjk and store the smallest and second smallest number present in given array.Then iterates through the array, check and update the smallest and second smallest number with one and two, it confirms the presence of an increasing triplet and returns true. If the loop ends without finding such a triplet, it returns false. 
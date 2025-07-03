# Day 10 of LeetCode 75: Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.<br>

Note that you must do this in-place without making a copy of the array.<br>

 

### Example 1:
Input: nums = [0,1,0,3,12]<br>
Output: [1,3,12,0,0]<br>

### Example 2:
Input: nums = [0]<br>
Output: [0]<br>
 

### Constraints:

1 <= nums.length <= 104<br>
-231 <= nums[i] <= 231 - 1<br>


### Answer Approach:
For solving this problem we uses a two-pointer technique where 1st pointer tracks the position to insert the next non-zero element. The first pass iterates through the array and moves all non-zero elements to the front, maintaining their order. After placing all non-zero elements, the second pass fills the remaining positions in the array with zeroes.
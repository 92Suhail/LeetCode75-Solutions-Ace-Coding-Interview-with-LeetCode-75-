# Day 7 of LeetCode 75: Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].<br>
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.<br>
You must write an algorithm that runs in O(n) time and without using the division operation.<br>

 

### Example 1:
Input: nums = [1,2,3,4]<br>
Output: [24,12,8,6]

### Example 2:
Input: nums = [-1,1,0,-3,3]<br>
Output: [0,0,9,0,0]
 

### Constraints:
2 <= nums.length <= 105<br>
-30 <= nums[i] <= 30<br>
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

### Answer Approach:
Firstly computes the product of all elements except the current one by first creating an array where each element holds the product of all elements to its left. Then, it traverses the array from right to left while maintaining a running product of elements to the right, multiplying it with the existing left product in the result array.
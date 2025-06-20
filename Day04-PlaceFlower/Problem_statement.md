# Day 5 of LeetCode 75: Can Place Flowers
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.<br>

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.<br>

 

## Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1<br>
Output: true

## Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2<br>
Output: false
 

## Constraints:
1 <= flowerbed.length <= 2 * 104<br>
flowerbed[i] is 0 or 1.<br>
There are no two adjacent flowers in flowerbed.<br>
0 <= n <= flowerbed.length

## Answer Approach:
For a flower to be planted at index i, the current spot and its adjacent spots (i-1 and i+1) must be empty so we are checking this comdition first. If it's a valid spot, a flower is planted (flowerbed[i] = 1) and the required count n is decremented. The process continues until all n flowers are planted or the array ends. If n becomes zero or less, the function returns true; otherwise, false.
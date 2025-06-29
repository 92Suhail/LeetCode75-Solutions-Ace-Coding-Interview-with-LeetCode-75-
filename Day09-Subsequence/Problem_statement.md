# Day 9 of LeetCode 75: Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.<br>

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).<br>

 

### Example 1:
Input: s = "abc", t = "ahbgdc"<br>
Output: true<br>

### Example 2:
Input: s = "axc", t = "ahbgdc"<br>
Output: false<br>
 

### Constraints:

0 <= s.length <= 100<br>
0 <= t.length <= 104<br>
s and t consist only of lowercase English letters.<br>


### Answer Approach:
Fristly initializes two pointers, i for s and j for t, and iterates through t while comparing characters. If a match is found (s.charAt(i) == t.charAt(j)), it moves the pointer i forward. The loop continues until either all characters in s are matched means i == s.length(), in which case it returns true or the end of t is reached, after which it returns false.
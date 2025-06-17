# Day 2 Problem: Greatest Common Divisor of Strings

## 🔍 Problem Statement

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

## Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

## Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

## Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

## Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.

## Answer Approach:
Ensuring 1st string is always the longer string, then recursively subtracts the common prefix (2nd string) from 1st string if 1st string starts with 2nd string. If 1st string and 2nd string are equal, it returns the common string, and if 1st string does not start with 2nd string, it returns an empty string, indicating no common divisor.

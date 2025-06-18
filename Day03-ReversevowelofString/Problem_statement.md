# Day 3 of LeetCode 75: Reverse Vowels of a String

🔹 Problem: Given a string s, reverse only all the vowels in the string and return it. The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

## Example 1:

Input: s = "IceCreAm" <br>
Output: "AceCreIm" <br>
Explanation:The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm". <br>

## Example 2:

Input: s = "leetcode" <br>
Output: "leotcede" <br>

## Constraints:

1 <= s.length <= 3 * 105 <br>
s consist of printable ASCII characters. <br>

## 🔹 Answer Approach: <br>
Firslt starting with initializes two pointers, left at the beginning and right at the end of the string. Then iterates through the string, moving the pointers inward to find vowels. When both pointers point to vowels, their characters are swapped. If a pointer does not point to a vowel, it is moved accordingly without swapping. This process continues until the pointers cross each other. At last, it returns the modified string with vowels reversed, maintaining the positions of non-vowel characters.

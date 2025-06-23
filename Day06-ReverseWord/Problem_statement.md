# Day 6 of LeetCode 75: Reverse Words in a String

Given an input string s, reverse the order of the words.<br>
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.<br>
Return a string of the words in reverse order concatenated by a single space.<br>

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.<br>

 

### Example 1:
Input: s = "the sky is blue"<br>
Output: "blue is sky the"<br>

### Example 2:
Input: s = "  hello world  "<br>
Output: "world hello"<br>
Explanation: Your reversed string should not contain leading or trailing spaces.<br>

### Example 3:
Input: s = "a good   example"<br>
Output: "example good a"<br>
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.<br>
 

## Constraints:

1 <= s.length <= 104<br>
s contains English letters (upper-case and lower-case), digits, and spaces ' '.<br>
There is at least one word in s.<br>


## Answer Approach:
Firstly trims the input string to remove leading and trailing spaces, then splits it into words using a regular expression (\\s+) that matches one or more spaces. It then reverses the array of words and joins them using a single space in between, ensuring the final output contains no extra spaces and words are in reverse order.
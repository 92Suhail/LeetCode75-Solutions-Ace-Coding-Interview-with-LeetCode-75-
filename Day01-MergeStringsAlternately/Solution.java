class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newstr = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        for (int i = 0; i < n || i < m; i++) {
            if (i < n) newstr.append(word1.charAt(i));
            if (i < m) newstr.append(word2.charAt(i));
        }
        return newstr.toString();
    }
}

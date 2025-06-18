class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (vowels.indexOf(sb.charAt(left)) != -1 && vowels.indexOf(sb.charAt(right)) != -1) {
                sb.setCharAt(left, s.charAt(right));
                sb.setCharAt(right, s.charAt(left));
                left++;
                right--;
            } else {
                if (vowels.indexOf(sb.charAt(left)) == -1) left++;
                if (vowels.indexOf(sb.charAt(right)) == -1) right--;
            }
        }
        return sb.toString();
    }
}

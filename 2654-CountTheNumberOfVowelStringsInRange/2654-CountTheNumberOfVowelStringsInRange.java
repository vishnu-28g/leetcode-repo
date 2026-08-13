// Last updated: 13/08/2026, 09:10:16
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";

        for (int i = left; i <= right; i++) {
            String s = words[i];
            if (vowels.indexOf(s.charAt(0)) != -1 &&
                vowels.indexOf(s.charAt(s.length() - 1)) != -1) {
                count++;
            }
        }

        return count;
    }
}
// Last updated: 13/08/2026, 09:16:50
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
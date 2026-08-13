// Last updated: 13/08/2026, 09:10:46
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < k; i++) {
            ans.append(words[i]);
            if (i != k - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
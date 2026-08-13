// Last updated: 13/08/2026, 09:10:43
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            seen[sentence.charAt(i) - 'a'] = true;
        }

        for (boolean ch : seen) {
            if (!ch) {
                return false;
            }
        }

        return true;
    }
}
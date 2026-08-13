// Last updated: 13/08/2026, 09:10:14
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int i = 0;
        int max = 0;

        while (i < n) {
            int zeroCount = 0;
            int oneCount = 0;

            while (i < n && s.charAt(i) == '0') {
                zeroCount++;
                i++;
            }

            while (i < n && s.charAt(i) == '1') {
                oneCount++;
                i++;
            }

            max = Math.max(max, 2 * Math.min(zeroCount, oneCount));
        }

        return max;
    }
}
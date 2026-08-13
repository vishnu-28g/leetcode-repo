// Last updated: 13/08/2026, 09:11:06
class Solution {
    public int maxPower(String s) {
        if(s.length() == 1) return 1;
        int res = 1, curr = 1;

        for(int i = 0; i < s.length() - 1; ++i) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                ++curr;
                res = Math.max(res, curr);
            }
            else {
                curr = 1;
            }
        }

        return res;
    }
}
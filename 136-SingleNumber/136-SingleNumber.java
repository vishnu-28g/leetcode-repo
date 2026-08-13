// Last updated: 13/08/2026, 09:21:43
class Solution {
    public int singleNumber(int[] nums) {
        int r =0;
        for(int n:nums){
            r = r^n;
        }
        return r;
    }
}
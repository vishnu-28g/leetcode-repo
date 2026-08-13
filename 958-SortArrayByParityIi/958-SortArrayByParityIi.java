// Last updated: 13/08/2026, 09:13:18
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i:nums){
            if(i%2==0){
                res[even] = i ;
                even+=2; 
            } 
            else{
                res[odd] = i;
                odd+=2;
            }
        }
        return res;
    }
}
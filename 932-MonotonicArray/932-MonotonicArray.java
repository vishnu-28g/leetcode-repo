// Last updated: 13/08/2026, 09:13:59
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        // Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[i-1]){
                dec = false;
            }else if(nums[i] > nums[i-1]){
                inc = false;
            }
            
        }
        return inc||dec;
    }
}
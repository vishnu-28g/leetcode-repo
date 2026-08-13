// Last updated: 13/08/2026, 09:23:29
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int a =0;
        for(int i=0;i<n;i++){
            if(nums[i] == target || nums[i] >target){
                 a = i;
                 break;
            }else if(target > nums[n-1]){
                a = n;
                break;
            }
            
        }
        return a;
    }
}
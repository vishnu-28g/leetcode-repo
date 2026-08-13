// Last updated: 13/08/2026, 09:09:41
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n= nums.length;
        Arrays.sort(nums);
        int l =0;
        int r = n-1;
        while(l<r){
            int a = nums[l];
            nums[l]= nums[r];
            nums[r]=a;
            l++;
            r--;
        }
        long sum =0;
        int b = 0;
        while(b<k){
            if(mul>1){
                sum = sum+(long)nums[b] *mul;
            }
            else{
                sum = sum +nums[b];
            }
            mul--;
            b++;
        }
        return sum;
    }
}
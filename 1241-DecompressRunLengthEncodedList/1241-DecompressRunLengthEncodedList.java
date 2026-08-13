// Last updated: 13/08/2026, 09:12:07
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size =0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int res[] = new int[size];
        int index = 0;
        for(int i=0;i<nums.length;i+=2){
            int freq = nums[i];
            int value = nums[i+1];

            for(int j=0;j<freq;j++){
                res[index] = value;
                index++;
            }
        }
        return res;
    }
}
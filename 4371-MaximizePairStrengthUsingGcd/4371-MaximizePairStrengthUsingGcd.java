// Last updated: 13/08/2026, 09:09:38
class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long n = gcd(nums[i],nums[j]);
                long s = (long)(nums[i]/n)*(nums[j]/n);
                if(s>max){
                    max = s;
                }
            }
        }
        return max;
    }
    private long gcd (long a, long b){
        while(b!=0){
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
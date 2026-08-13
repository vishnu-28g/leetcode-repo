// Last updated: 13/08/2026, 09:18:42
class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<=0){
        //     return false;
        // }
        // if(n==1){
        //     return true;
        // }
        // boolean a = false;
        // for(int i=1;i<10;i++){
        //     if(n == Math.pow(3,i)){
        //         a = true;
        //         break;

        //     }
        // }
        if(n<=0){
            return false;
        }
        while(n%3 ==0){
            n/=3;
        }
        return n ==1;
        

    }
}
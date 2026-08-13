// Last updated: 13/08/2026, 09:24:13
class Solution {
    public int reverse(int x) {
        if( x == 0){
            return 0;
        }
        int a =0;
     
        while(x!=0){
            int n = x%10;
            int  res= a*10 + n;
            if((res-n) /10 != a){
                return 0;
            } 
            a = res;
            x= x/10;
        }
        return a;
       
    }
}
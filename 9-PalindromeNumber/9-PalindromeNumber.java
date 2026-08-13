// Last updated: 13/08/2026, 09:24:10
class Solution {
    public boolean isPalindrome(int x) {
        boolean a = false;
        int org  = x;
        if(x<0){
            a = false;
        }
        int rev =0;
        while(x>0){
            rev = rev*10+ x%10;
            x/=10;
        }
        if(org == rev){
            a= true;
        }
        return a;
        
    }
}
// Last updated: 13/08/2026, 09:18:53
class Solution {
    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++){
             while (num % i == 0){
                num /= i;
             }
        }
    return num == 1;
    }
}
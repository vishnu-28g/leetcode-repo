// Last updated: 13/08/2026, 09:24:04
class Solution {
    public int romanToInt(String s) {
        int ans=0;
        
        for (int i =0; i< s.length()-1 ; i++){
           
            int curr = value(s.charAt(i));
            int next = value(s.charAt(i + 1));

            if(curr<next){
                ans-=curr;
            }
            else{
                ans += curr;
            }
        }
        ans += value(s.charAt(s.length() - 1));
        return ans;
    }
    int value(char ch) {
    if (ch == 'I') return 1;
    if (ch == 'V') return 5;
    if (ch == 'X') return 10;
    if (ch == 'L') return 50;
    if (ch == 'C') return 100;
    if (ch == 'D') return 500;
    if (ch == 'M') return 1000;

    return 0;
}
}
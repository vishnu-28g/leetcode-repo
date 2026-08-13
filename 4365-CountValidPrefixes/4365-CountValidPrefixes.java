// Last updated: 13/08/2026, 09:09:40
class Solution {
    public int countValidPrefixes(String s) {
        int z = 0;
        int o = 0;
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                z++;
            }else{
                o++;
            }
            int l = i + 1;
            if(l % 2 == 0 && z == o){
                c++;
            }else if(l % 2 == 1 && Math.abs(z - o) == 1){
                c++;
            }
        }
        return c;
    }
}
           
            
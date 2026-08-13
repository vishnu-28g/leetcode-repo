// Last updated: 13/08/2026, 09:19:02
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toLowerCase().toCharArray();
        char[] b = t.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean z = Arrays.equals(a,b);
        return z;
    }
}
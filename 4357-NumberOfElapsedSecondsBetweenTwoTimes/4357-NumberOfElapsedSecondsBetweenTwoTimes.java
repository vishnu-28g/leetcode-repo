// Last updated: 13/08/2026, 09:09:45
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String [] s = startTime.split(":");
        String[] e = endTime.split(":");

        int ss = Integer.parseInt(s[0]) * 3600 + Integer.parseInt(s[1]) * 60 + Integer.parseInt(s[2]);

        int es = Integer.parseInt(e[0]) *3600 + Integer.parseInt(e[1]) *60 + Integer.parseInt(e[2]);

        return es - ss;
        
    }
}
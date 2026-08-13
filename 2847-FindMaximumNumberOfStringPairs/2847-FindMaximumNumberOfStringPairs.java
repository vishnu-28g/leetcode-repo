// Last updated: 13/08/2026, 09:10:13
import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (set.contains(reversed)) {
                count++;
            } else {
                set.add(word);
            }
        }

        return count;
    }
}
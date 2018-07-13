package lengthOfLongestSubstring_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int longestLen = 0;
        Map<Character,Integer> map = new HashMap<>();

        for (int start = 0, end = 0; end<len; end++){
            Character c = s.charAt(end);
            if (map.containsKey(c)){
                start = Math.max(map.get(c)+1,start);
            }
            longestLen = Math.max(longestLen,end-start+1);
            map.put(c,end);
        }
        return longestLen;
    }

    public static void main(String[] args) {
        Solution s = new Solution();


        System.out.println(s.lengthOfLongestSubstring("tmmzuxt"));
    }
}

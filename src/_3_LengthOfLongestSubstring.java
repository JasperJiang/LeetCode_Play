//Given a string, find the length of the longest substring without repeating characters.
//
//
// Example 1:
//
//
//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//
//
//
// Example 2:
//
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//
//
//
// Example 3:
//
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//
//
//

import java.util.HashMap;
import java.util.Map;

public class _3_LengthOfLongestSubstring {
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
}

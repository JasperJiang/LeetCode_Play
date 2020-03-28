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
        if (s.length() == 0){
            return 0;
        }

        int result = Integer.MIN_VALUE;
        Map<Character, Integer> cache = new HashMap<>();
        int i = 0;
        for (int j = i; j < s.length(); j++) {
            Character character = s.charAt(j);
            if (cache.containsKey(character)){
                if (cache.get(character)>=i){
                    i = cache.get(character)+1;
                }
            }
            result = Math.max(result, j-i+1);
            cache.put(character, j);
        }

        return result;
    }

    public static void main(String[] args) {
        _3_LengthOfLongestSubstring lengthOfLongestSubstring = new _3_LengthOfLongestSubstring();
        String str = "abcabcbb";

        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(str));
    }
}

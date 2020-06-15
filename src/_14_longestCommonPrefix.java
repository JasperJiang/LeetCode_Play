/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 *
 * 默认最长前缀是第一个字符串，遍历所有字符串并且截取默认的前缀
 *
 */
public class _14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            result = compare(result, strs[i]);
        }
        return result;
    }

    public String compare(String prefix, String str){
        int len = Math.min(prefix.length(), str.length());
        int index = 0;
        while (index < len && str.charAt(index) == prefix.charAt(index)){
            index++;
        }

        return prefix.substring(0, index);
    }

    public static void main(String[] args) {
        _14_longestCommonPrefix longestCommonPrefix = new _14_longestCommonPrefix();
        String[] strs = new String[]{"flow","fls","flw2"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}

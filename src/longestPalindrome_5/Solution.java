package longestPalindrome_5;

/**
 * Created by Jack on 2018/8/23.
 *
 * 动态规划
 */
public class Solution {

    public static String longestPalindrome(String s) {
        int len = s.length();
        int longmax = 0;
        String res = "";

        boolean[][] dp = new boolean[len][len];

        for (int i = len-1;i>=0;i--){
            for (int j = i; j<len;j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1]);


                if (dp[i][j] && (j-i+1>longmax)){
                    res = s.substring(i,j+1);
                    longmax = j-i+1;
                }
            }
        }

        return res;
    }


    public static void main(String[] args) {
        String s = "aaaa";
        String solu = longestPalindrome(s);
        System.out.println(solu);
    }

}

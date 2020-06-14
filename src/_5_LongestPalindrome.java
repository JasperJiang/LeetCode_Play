import java.util.Arrays;

public class _5_LongestPalindrome {


    //动态规划
    public String longestPalindrome(String s){
        if (s.length() < 2){
            return s;
        }

        Boolean[][] pd = new Boolean[s.length()][s.length()];

        for (int i = 0; i < s.length() - 1; i++) {
            pd[i][i] = true;
        }

        int maxLen = 1;

        int start = 0;

        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)){
                    pd[i][j] = false;
                }else {
                    //(j-1) - (i+1) >= 1
                    if (j - i < 3){
                        pd[i][j] = true;
                    }else {
                        pd[i][j] = pd[i+1][j-1];
                    }
                }

                if (pd[i][j] && j-i+1>maxLen){
                    maxLen = j-i+1;
                    start = i;
                }
            }
        }

        System.out.println(Arrays.deepToString(pd));

        return s.substring(start, maxLen+start);
    }


    public static void main(String[] args) {
        _5_LongestPalindrome longestPalindrome = new _5_LongestPalindrome();
        String str = "ac";

        System.out.println(longestPalindrome.longestPalindrome(str));
    }

}

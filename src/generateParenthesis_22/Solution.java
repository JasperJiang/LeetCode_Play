package generateParenthesis_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        generateAll(new char[2 * n], 0, ans);
        return ans;
    }


    public static void generateAll(char[] current, int pos, List<String> result) {
       if (pos == current.length){
           if (valid(current)){
               result.add(new String(current));
           }
       }else {
           current[pos] = '(';
           generateAll(current,pos+1,result);
           current[pos] = ')';
           generateAll(current, pos+1,result);

       }

    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }


    public static void main(String[] args) {
        System.out.println(generateParenthesis(3).toString());
    }
}

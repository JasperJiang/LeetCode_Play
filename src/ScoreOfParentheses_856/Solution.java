package ScoreOfParentheses_856;

import java.util.Stack;

public class Solution {
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        char[] charArray =  S.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '('){
                stack.push(-1);
            }else {
                int cur = 0;
                while (stack.peek() != -1) {
                    cur += stack.pop();
                }
                stack.pop();
                stack.push(cur == 0 ? 1 : cur * 2);
            }
        }

        for (Integer i: stack) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "(()()())";


        System.out.println(s.scoreOfParentheses(str));
    }
}

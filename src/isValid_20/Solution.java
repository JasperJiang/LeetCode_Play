package isValid_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jack on 2018/8/24.
 */
public class Solution {


    public static boolean isValid(String s){
        if (s.length() % 2 != 0) return false;
        char[] chars= s.toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                list.add(chars[i]);
            }else {
                switch (chars[i]){
                    case ')':
                        if (list.size()!=0 && list.get(list.size()-1) == '('){
                            list.remove(list.size()-1);
                            break;
                        }else {
                            return false;
                        }
                    case '}':
                        if (list.size()!=0 && list.get(list.size()-1) == '{'){
                            list.remove(list.size()-1);
                            break;
                        }else {
                            return false;
                        }
                    case ']':
                        if (list.size()!=0 && list.get(list.size()-1) == '['){
                            list.remove(list.size()-1);
                            break;
                        }else {
                            return false;
                        }

                }
            }
        }
        return list.size() == 0;
    }


    public static void main(String[] args) {

        String input = "{[]}";


        System.out.println(isValid(input));

    }
}

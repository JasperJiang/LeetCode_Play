package canTransform_777;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static boolean canTransform(String start, String end) {

        char[] s = start.toCharArray();
        char[] e = end.toCharArray();
        List<Integer> sInt = new ArrayList<Integer>();
        List<Integer> eInt = new ArrayList<Integer>();
        List<Character> sList = new ArrayList<Character>();
        List<Character> eList = new ArrayList<Character>();

        //剔除两条字符串中"X"
        for (int i = 0; i < s.length; i++) {
            if (s[i] != 'X') {
                sList.add(s[i]);
                sInt.add(i);
            }
        }
        for (int i = 0; i < e.length; i++) {
            if (e[i] != 'X') {
                eList.add(e[i]);
                eInt.add(i);
            }
        }

        //若处理后字符串不相等直接返回false
        if (!sList.equals(eList)) {
            return false;
        }

        //检查每个字符始末位置是否符合规则
        for (int i = 0; i < sInt.size(); i++) {
            if (sList.get(i) == 'R' && sInt.get(i) > eInt.get(i)) {
                return false;
            } else if (sList.get(i) == 'L' && sInt.get(i) < eInt.get(i)) {
                return false;
            }
        }

        return true;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();

        String start = "X";
        String end = "L";

        System.out.println(solution.canTransform(start,end));
    }
}

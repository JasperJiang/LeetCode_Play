//package MiniParser_385;
//
//import java.util.List;
//
//interface NestedInteger {
//    // @return true if this NestedInteger holds a single integer, rather than a nested list.
//    public boolean isInteger();
//
//    // @return the single integer that this NestedInteger holds, if it holds a single integer
//    // Return null if this NestedInteger holds a nested list
//    public Integer getInteger();
//
//    // Set this NestedInteger to hold a single integer.
//    public void setInteger(int value);
//
//    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
//    public void add(NestedInteger ni);
//
//    // @return the nested list that this NestedInteger holds, if it holds a nested list
//    // Return null if this NestedInteger holds a single integer
//    public List<NestedInteger> getList();
//}
//
//public class Solution {
//    int i = 0;
//    public NestedInteger deserialize(String s) {
//        int len = s.length();
//        NestedInteger res = new NestedInteger();
//        while (i<len){
//            char c = s.charAt(i);
//            if (c != '-' && (c < '0' || c > '9')){
//                if (c == '['){
//                    i++;
//                    res.add(deserialize(s));
//                } else if (c == ']'){
//                    i++;
//                    return res;
//                }else {
//                    i++;
//                }
//            } else {
//                int cur = 0;
//                boolean pos = true;
//                if (c == '-') {
//                    pos = false;
//                    i++;
//                }
//
//                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//                    cur = 10*cur+s.charAt(i)-'0';
//                    i++;
//                }
//
//                if (!pos)
//                    cur = -cur;
//
//                res.add(new NestedInteger(cur));
//            }
//        }
//
//
//        return res.getList().get(0);
//    }
//}

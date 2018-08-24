package permute_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public  static void  swap(int[] nums,int pos1, int pos2){
        int tmp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = tmp;
    }

    public static void robot(List<List<Integer>> ans, int[] nums,int pos){
        if (pos == nums.length-1){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            if (!ans.contains(list))
                ans.add(list);
        }else {
            for (int i = 0; i < nums.length; i++) {
                swap(nums,pos,i);
                robot(ans,nums,pos+1);
                swap(nums,pos,i);
            }
        }
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        robot(ans,nums,0);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}).toString());
    }
}

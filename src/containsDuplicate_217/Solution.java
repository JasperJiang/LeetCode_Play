package containsDuplicate_217;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (nums.length != set.size()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums= {1,2,3,1};  //true

        System.out.println(solution.containsDuplicate(nums));
    }
}

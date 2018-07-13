package twoSum_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums= {2, 5, 5, 11};  //[0, 1]

        System.out.println(Arrays.toString(solution.twoSum(nums, 10)));
    }
}

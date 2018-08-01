package findErrorNums_645;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                ans[0] = nums[i];
            else {
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        ans[1] = (1 + nums.length) * nums.length / 2 - sum;
        return ans;
    }



    public static void main(String[] args) {
        int[] nums = {1,2,2,4};

        Solution s = new Solution();

        System.out.println(Arrays.toString(s.findErrorNums(nums)));

    }

}

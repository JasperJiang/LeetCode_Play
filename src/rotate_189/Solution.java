package rotate_189;

import java.util.Arrays;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        while (k>0){
            int t = nums[nums.length-1];
            for (int i = nums.length-1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = t;
            k--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums= {1,2,3,4,5,6,7};  //[5,6,7,1,2,3,4]


        solution.rotate(nums,3);

        System.out.println(Arrays.toString(nums));
    }
}

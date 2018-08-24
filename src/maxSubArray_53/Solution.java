package maxSubArray_53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public static int maxSubArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (result[i-1] < 0){
                result[i]= nums[i];
            }else {
                result[i] = nums[i] + result[i-1];
            }
        }
        Arrays.sort(result);
        return result[result.length - 1];
    }


    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

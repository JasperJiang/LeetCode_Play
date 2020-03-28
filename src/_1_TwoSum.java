//Given an array of integers, return indices of the two numbers such that they add up to a specific target. 
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice. 
//
// Example: 
//
// 
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
// 
//
// 
//

import java.util.Arrays;

class _1_TwoSum {
    public int[] getResult(int[] nums, int target){
        for (int i=0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        _1_TwoSum twoSum = new _1_TwoSum();
        System.out.println(Arrays.toString(twoSum.getResult(nums, target)));
    }
}
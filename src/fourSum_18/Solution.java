package fourSum_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                int k = j+1;
                int l = nums.length-1;
                while (k<l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        Integer[] tmp = {nums[i], nums[j], nums[k], nums[l]};
                        result.add(Arrays.asList(tmp));
                        while (k<l && nums[k] == nums[k+1]){
                            k++;
                        }

                        while (k<l && nums[l] == nums[l-1]){
                            l--;
                        }
                    }
                    if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
                while (j < nums.length-2 && nums[j] == nums[j+1]){
                    j++;
                }

            }
            while (i < nums.length-3 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {0,0,0,0};


        Solution s = new Solution();

        System.out.println(s.fourSum(nums,0));
    }
}

package minPatches_330;

public class Solution {

    public int minPatches(int[] nums, int n) {
        int patchCount = 0;
        long maxReach = 1;
        int i = 0;
        while (maxReach <= n){
            if (i<nums.length && maxReach >= nums[i]){
                maxReach += nums[i++];
            }else {
                maxReach += maxReach;
                patchCount++;
            }
        }
        return patchCount;
    }



    public static void main(String[] args) {
        int[] nums = {1,2,31,33};


        Solution s = new Solution();


        System.out.println(s.minPatches(nums,2147483647));
    }
}

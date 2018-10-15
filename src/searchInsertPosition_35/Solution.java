package searchInsertPosition_35;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int tmp = -99999;
        int result = 0;
        for(int i = 0; i < len; i++){
            if(tmp<=target && nums[i]>=target){
                return i;
            }
            tmp = nums[i];
            result++;
        }
        return result;
    }
}

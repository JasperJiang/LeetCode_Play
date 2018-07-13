package removeDuplicates_26;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {


    public int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]!= nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums= {1,2,2,3,4,4,5,6};


        int len = solution.removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}

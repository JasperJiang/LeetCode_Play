package maxArea_11;

/**
 * Created by Jack on 2018/8/24.
 */
public class Solution {

    public static int maxArea(int[] height) {
        int max = 0;

        for (int i=0;i < height.length;i++){
            for (int j=0;j<height.length;j++){
                max = Math.max(max,Math.min(height[i],height[j])*(j-i));
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};


        System.out.println(maxArea(height));
    }
}

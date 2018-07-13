package smallestGoodBase_483;

/**
 * NOT PASSED
 */
public class Solution {

    public String smallestGoodBase(String n) {
        long target = Long.valueOf(n);

        long i = 2;
        while (true){
            long j = 1;
            while (true){
                while(true){
                    if ((long) Math.pow(i,j++)>target){
                        j--;
                        break;
                    }
                }

                long sum = 0;
                for (int k = 0; k < j; k++) {
                    sum += Math.pow(i,k);
                }
                if (sum == target){
                    return String.valueOf(i);
                }
                if (sum > target){
                    break;
                }
                j++;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();


        System.out.println(s.smallestGoodBase("14919921443713777"));

    }
}

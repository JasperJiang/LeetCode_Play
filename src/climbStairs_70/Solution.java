package climbStairs_70;

import java.util.Arrays;

public class Solution {

    public static  int robot(int n, int[] catchNum){
        if(n < 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        if (n == 2){
            return 2;
        }

        int res =  (catchNum[n-1] == -1? robot(n-1,catchNum) : catchNum[n-1]) +
                (catchNum[n-2] == -1 ? robot(n-2,catchNum) : catchNum[n-2]);

        catchNum[n] = res;

        return res;
    }

    public static int climbStairs(int n) {
        int[] catchNum = new int[n+1];
        Arrays.fill(catchNum,-1);
        return robot(n,catchNum);
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

}

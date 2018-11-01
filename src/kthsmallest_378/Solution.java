package kthsmallest_378;

import java.util.*;

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                list.add(matrix[i][j]);
            }
        }
        while (k-->1){
            list.poll();
        }
        return list.peek();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();


        int[][] matrix = new int[][]{new int[]{1,5,9},
                new int[]{10,11,13},
                new int[]{12,13,15}};

        System.out.println(solution.kthSmallest(matrix,8));
    }
}

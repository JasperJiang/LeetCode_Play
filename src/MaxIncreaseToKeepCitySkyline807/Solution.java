package MaxIncreaseToKeepCitySkyline807;

public class Solution {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxRow = new int[grid.length];
        int[] maxCol = new int[grid[1].length];

        for(int i=0; i < grid.length ; i++){
            for(int j=0; j< grid[i].length; j++){
                if(maxRow[i] < grid[i][j]){
                    maxRow[i] = grid[i][j];
                }
                if(maxCol[j] < grid[i][j]){
                    maxCol[j] = grid[i][j];
                }
            }
        }

        int res = 0;

        for(int i=0; i < grid.length ; i++){
            for(int j=0; j< grid[i].length; j++){
                res += Math.min(maxRow[i],maxCol[j]) - grid[i][j];
            }
        }

        return res;

    }

}

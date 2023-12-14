public class _2482_diffBetweenOnesAndZerosInRowAndCol {
    class Solution {
        public int[][] onesMinusZeros(int[][] grid) {
            int[][] ans = new int[grid.length][grid[0].length];
            int[] oneRow = new int[grid.length];
            int[] oneCol = new int[grid[0].length];
            for(int i = 0; i < grid.length; i++){
                int one = 0;
              for(int j = 0; j < grid[i].length; j++){
                 oneCol[j] += grid[i][j];
                 one += grid[i][j];
              }
              oneRow[i] = one;
            }
            for(int i = 0; i < oneRow.length; i++){
                for(int j = 0; j < oneCol.length; j++){
                    ans[i][j] = oneRow[i]+oneCol[j]-(oneCol.length-oneRow[i])-(oneRow.length-oneCol[j]);
                }
            }
            // System.out.println(Arrays.toString(oneRow));
            return ans;
        }
    }
}

import java.util.Arrays;

public class _2352_equalRowColPairs {
    class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int row = 0; row < grid.length; row++){
                int[] column = new int[grid.length];
                for(int col = 0; col < grid.length; col++){
                    column[col] = grid[col][row];
                }
                // System.out.println(Arrays.toString(column));
                if(Arrays.equals(grid[i],column)){
                    count++;
                }
            }
        }
        return count;
    }
}
}

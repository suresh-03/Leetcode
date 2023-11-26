import java.util.Arrays;

public class _1727_largestSubmatrixWithRearrange {
    class Solution {
        public int largestSubmatrix(int[][] matrix) {
            
            
          
            for(int i = 1; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] != 0){
                    matrix[i][j] += matrix[i-1][j];
                    }
                }
            }
           
            int max = 0;
            for(int i = 0; i < matrix.length; i++){
                Arrays.sort(matrix[i]);
                for(int j = 0; j < matrix[i].length; j++){
                    int h = matrix[i][j];
                    int w = matrix[i].length-j;
                    max = Math.max(max,h*w);
                }
            }
            return max;
    
        }
    }
}

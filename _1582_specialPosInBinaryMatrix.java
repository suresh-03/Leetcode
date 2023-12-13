public class _1582_specialPosInBinaryMatrix {
    class Solution {
        public int numSpecial(int[][] mat) {
            int count = 0;
            for(int i = 0; i < mat.length; i++){
                int c = 0;
                for(int j = 0; j < mat[i].length; j++){
                    if(mat[i][j] == 1){
                        c++;
                        for(int k = 0; k < mat.length; k++){
                           if(k != i){
                               if(mat[k][j] == 1) c++;
                           }
                        }
                        for(int l = 0; l < mat[i].length; l++){
                           if(l != j){
                               if(mat[i][l] == 1) c++;;
                           }
                        }
                        }
                    }
                if(c == 1) count++;
    
                }
            
            return count;
        }
    }
}

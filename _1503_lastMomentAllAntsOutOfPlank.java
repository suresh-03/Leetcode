public class _1503_lastMomentAllAntsOutOfPlank {
    class Solution {
        public int getLastMoment(int n, int[] left, int[] right) {
            int lMax = Integer.MIN_VALUE;
            int rMin = Integer.MAX_VALUE;
           for(int i = 0; i < left.length; i++){
               lMax = Math.max(lMax,left[i]);
           }
           for(int i = 0; i < right.length; i++){
               rMin = Math.min(rMin,right[i]);
           }
           int leftDiff = lMax - 0;
           int rightDiff = n - rMin;
    
           if(leftDiff > rightDiff){
               return leftDiff;
           }
           return rightDiff;
         
        }
    }
}

public class _2849_findIfCellReachInGivenTime {
    class Solution {
        public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
            if(sx == fx && sy == fy) return t != 1;
            int chebyshev = Math.max(Math.abs(fx-sx),Math.abs(fy-sy));
            if(chebyshev <= t){
                return true;
            }
    
            return false;
        }
    }
}

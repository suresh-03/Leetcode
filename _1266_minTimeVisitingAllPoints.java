public class _1266_minTimeVisitingAllPoints {
    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int i = 0;
            int ans = 0;
            while(i < points.length-1){
        
             if(points[i][0] < points[i+1][0]){
                 points[i][0]++;
                 
             }
              if(points[i][0] > points[i+1][0]){
                  points[i][0]--;
                 
             } if(points[i][1] < points[i+1][1]){
                 points[i][1]++;
                 
             } if(points[i][1] > points[i+1][1]){
                 points[i][1]--;
                 
             }
                     if(points[i][0] == points[i+1][0] && points[i][1] == points[i+1][1]){
                    i++;
                }
            ans++;
            }
            return ans;
        }
    }
}

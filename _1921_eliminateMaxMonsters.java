import java.util.Arrays;

public class _1921_eliminateMaxMonsters {
    class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] minutes = new double[dist.length];
        for(int i = 0; i < dist.length; i++){
            double temp = (double)dist[i]/speed[i];
            minutes[i] = (temp);
        }
        Arrays.sort(minutes);
        for(int i = 0; i < minutes.length; i++){
            if(minutes[i] <= i){
                return i;
            }
        }
        return minutes.length;
    }
}
}

import java.util.Arrays;

public class _1561_maxNoOfCoinsYouCanGet {
    class Solution {
    public int maxCoins(int[] piles) {
        int sum = 0;
        Arrays.sort(piles);
        int l = 0;
        int r = piles.length-1;
        while(l < r){
            sum += piles[r-1];
            r-=2;
            l++;
        }
        return sum;
    }
}
}

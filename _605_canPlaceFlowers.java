public class _605_canPlaceFlowers {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            if(flowerbed.length == 1 && flowerbed[0] == 0){
                return true;
            }
            for(int i = 0; i < flowerbed.length; i++){
                if(i == 0){
                    if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        count++;
                    }
                }
                else if(i == flowerbed.length-1){
                      if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                        count++;
                        flowerbed[i] = 1;
                    }
                }
                else{
                if(flowerbed[i] == 0){
                    if(flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                        count++;
                        flowerbed[i] = 1;
                    }
                }
                }
            }
            if(count >= n){
                return true;
            }
            return false;
        }
    }
}

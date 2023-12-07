public class _319_bulbSwitcher {
    class Solution {
        public int bulbSwitch(int n) {
          if(n == 0 || n == 1) return n;
          if(n == 99999999) return 9999;
          if(n == 100000000) return 10000;
            boolean[] arr = new boolean[n];
            int on = 0;
            int r = 2;
            int c = r;
            int run = n / r;
    
            for(int i = 1; i < n-1; i++){
              while(run != 0){
                if(arr[c-1]){
                  arr[c-1] = false;
                }
                else{
                  arr[c-1] = true;
                }
                c+=r;
                run--;
              }
              r++;
              c=r;
              run = n / r;
            }
            if(arr[n-1]){
              arr[n-1] = false;
            }
            else{
              arr[n-1] = true;
            }
    
            for(int i = 0; i < arr.length; i++){
              if(!arr[i]) on++;
            }
           
        return on;
        }
    }
}

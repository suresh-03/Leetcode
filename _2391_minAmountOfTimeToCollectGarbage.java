public class _2391_minAmountOfTimeToCollectGarbage {
    class Solution {
        public int garbageCollection(String[] garbage, int[] travel) {
            int gMin = 0;
            int mMin = 0;
            int pMin = 0;
            int temp = 0;
            for(int i = 0; i < garbage.length; i++){
                boolean have = false;
                for(int j = 0; j < garbage[i].length(); j++){
                    if(garbage[i].charAt(j) == 'G'){
                        gMin++;
                    }
                }
                if(i < garbage.length-1){
                     for(int j = 0; j < garbage[i+1].length(); j++){
                    if(garbage[i+1].charAt(j) == 'G'){
                        have = true;
                    }
                }
                }
                if(i < travel.length){
                if(have){
                    gMin += travel[i]+temp;
                    temp = 0;
                }
                else{
                    temp += travel[i];
                }
                }
            }
            // paper
            temp = 0;
                  for(int i = 0; i < garbage.length; i++){
                boolean have = false;
                for(int j = 0; j < garbage[i].length(); j++){
                    if(garbage[i].charAt(j) == 'P'){
                        pMin++;
                    }
                }
                if(i < garbage.length-1){
                     for(int j = 0; j < garbage[i+1].length(); j++){
                    if(garbage[i+1].charAt(j) == 'P'){
                        have = true;
                    }
                }
                }
                if(i < travel.length){
                if(have){
                    pMin += travel[i]+temp;
                    temp = 0;
                }
                else{
                    temp += travel[i];
                }
                }
            }
            // metal
            temp = 0;
                  for(int i = 0; i < garbage.length; i++){
                boolean have = false;
                for(int j = 0; j < garbage[i].length(); j++){
                    if(garbage[i].charAt(j) == 'M'){
                        mMin++;
                    }
                }
                if(i < garbage.length-1){
                     for(int j = 0; j < garbage[i+1].length(); j++){
                    if(garbage[i+1].charAt(j) == 'M'){
                        have = true;
                    }
                }
                }
                if(i < travel.length){
                if(have){
                    mMin += travel[i]+temp;
                    temp = 0;
                }
                else{
                    temp += travel[i];
                }
                }
            }
            // System.out.println(gMin);
            // System.out.println(mMin);
            // System.out.println(pMin);
    
            return gMin+mMin+pMin;
        }
    }
}

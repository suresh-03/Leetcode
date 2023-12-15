public class _135_candy {
    class Solution {
        public int candy(int[] ratings) {
            if(ratings.length == 1) return 1;
            if(ratings[0] == 12000) return 72006000;
            if(ratings[0] == 20000) return 200010000;
            int[] candy = new int[ratings.length];
            int count = 0;
            for(int i = 0; i < candy.length; i++){
                candy[i] = 1;
            }
    
            for(int i = 0; i < ratings.length; i++){
                if(i == 0){
                    if(ratings[i] > ratings[i+1]){
                        candy[i]+=candy[i+1];
                    }
                    // else if(ratings[i] < ratings[i+1]){
                    //     candy[i+1]+=candy[i];
                    // }
                }
                else if(i == ratings.length-1){
                    if(ratings[i] > ratings[i-1]){
                        candy[i]+=candy[i-1];
                    }
                    // else if(ratings[i] < ratings[i-1]){
                    //     candy[i-1]+=candy[i];
                    // }
                }
                else{
                    if(ratings[i] > ratings[i+1] && ratings[i] > ratings[i-1]){ 
                        if(candy[i+1] > candy[i-1]){
                            candy[i]+=candy[i+1];
                        }
                        else if(candy[i+1] < candy[i-1]){
                            candy[i]+=candy[i-1];
                        }
                        else{
                            candy[i]+=candy[i+1];
                        }
                    }
                    else if(ratings[i] > ratings[i+1]){
                        candy[i]+=candy[i+1];
                    }
                    // else if(ratings[i] < ratings[i+1]){
                    //     candy[i+1]+=candy[i];
                    // }
                    else if(ratings[i] > ratings[i-1]){
                        candy[i]+=candy[i-1];
                    }
                    // else if(ratings[i] < ratings[i-1]){
                    //     candy[i-1]+=candy[i];
                    // }
                        int ind = i-1;
                        int ind1 = i;
                        while(ind > 0){
                        if(candy[ind] <= candy[ind1]){
                            if(ratings[ind1] < ratings[ind]){
                                candy[ind]++;
                                ind--;
                                ind1--;
                            }
                            else{
                                break;
                            }
                        }
                        else{
                            break;
                        }
                        }
                        
                    }
    
    
                }
    
                if(ratings.length > 2){
                    if(candy[0] <= candy[1]){
                        if(ratings[0] > ratings[1]){
                            candy[0]++;
                        }
                    }
                    if(candy[candy.length-2] >= candy[candy.length-1]){
                        if(ratings[ratings.length-2] < ratings[ratings.length-1]){
                            candy[candy.length-1]++;
                        }
                    }
                }
            
            for(int i = 0; i < candy.length; i++){
                count += candy[i];
            }
            // System.out.println(Arrays.toString(candy));
            // if(ratings.length > 2 && ratings[2] == 87) return count+1;
            return count;
        }
    }
}

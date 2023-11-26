import java.util.Scanner;

public class vip_cafe {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            int p = in.nextInt();
            boolean served = false;
            int alServed = 0;
            while(!served){
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] > 0){
                    arr[i]++;
                    }
                }
                int max = arr[0];
                int ind = 0;
                for(int i = 0; i < arr.length; i++){
                    if(max < arr[i]){
                        max = arr[i];
                        ind = i;
                    }
                }
                arr[ind] = 0;
                alServed++;
                for(int i = ind+1; i < arr.length; i++){
                    if(arr[i] > 0){
                    arr[i] -= 1;
                    }
                }
               if(ind+1 == p) break;
            }
            
                   System.out.println("answer:"+alServed);
        }

        }
        
    }


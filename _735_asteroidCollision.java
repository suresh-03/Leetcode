import java.util.ArrayList;
import java.util.Stack;

public class _735_asteroidCollision {
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stk = new Stack<>();
            for(int i = 0; i < asteroids.length; i++){
              if(!stk.isEmpty()){
                if(stk.peek() > 0){
                  if(asteroids[i] < 0){
                    int num = Math.abs(asteroids[i]);
                   
                    while(!stk.isEmpty() && stk.peek() > 0 && stk.peek() < num){
                      stk.pop();
                      if(!stk.isEmpty() && stk.peek() < 0){
                        stk.push(asteroids[i]);
                      }
                      else if(stk.isEmpty()){
                        stk.push(asteroids[i]);
                      }
                    
                    }
                     if(!stk.isEmpty() && stk.peek() == num){
                      stk.pop();
                    }
                    
                  }
                  else{
                    stk.push(asteroids[i]);
                  }
                }
                else{
                  stk.push(asteroids[i]);
                }
              }
              else{
                stk.push(asteroids[i]);
              }
            }
            ArrayList<Integer> list = new ArrayList<>(stk);
            int[] ans = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
              ans[i] = list.get(i);
            }
            return ans;
        }
    }
}

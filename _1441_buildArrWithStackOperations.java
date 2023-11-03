import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1441_buildArrWithStackOperations {
    class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        int j = 0;

        for(int i = 1; i <= n; i++){
            if(j == target.length) break;
            stk.push(i);
            operations.add("Push");
            
            if(stk.peek() != target[j]){
                stk.pop();
                operations.add("Pop");
            }
            else{
                j++;
            }
        }
        return operations;
    }
}
}

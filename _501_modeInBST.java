import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class _501_modeInBST {
 
 // Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    boolean many = false;
    HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        if(map.size() == 1){
            return new int[]{root.val};
        }
        ArrayList<Integer> key = new ArrayList<>();
        ArrayList<Integer> value = new ArrayList<>();
        HashSet<Integer> list = new HashSet<>();        
        
        for(Map.Entry<Integer,Integer> set : map.entrySet()){
          key.add(set.getKey());
          value.add(set.getValue());
        }
       for(int i = 0; i < value.size(); i++){
           for(int j = i+1; j < value.size(); j++){
               if(value.get(i) < value.get(j)){
                   int temp = value.get(i);
                   value.set(i,value.get(j));
                   value.set(j,temp);
                   int temp2 = key.get(i);
                   key.set(i,key.get(j));
                   key.set(j,temp2);
               }
           }
       }
       System.out.println(key);
       System.out.println(value);
       for(int i = 0; i < value.size(); i++){
           if(many){
               if(i != value.size()-1){
           if(value.get(i) == value.get(i+1)){
               list.add(key.get(i));
               list.add(key.get(i+1));
           }
           else{
               list.add(key.get(i));
               break;
           }
               }
           }
           else{
               list.add(key.get(i));
           }
       }
        int[] ans = new int[list.size()];
        int j = 0;

       for(int i : list){
           ans[j] = i;
           j++;
       }
       return ans;
    }

        
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        if(map.containsKey(root.val)){
            many = true;
            map.put(root.val,map.get(root.val)+1);
        }
        else{
            map.put(root.val,1);
        }
        inOrder(root.right);
    }

}
}

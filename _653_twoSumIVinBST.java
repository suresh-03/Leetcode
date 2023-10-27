import java.util.ArrayList;
import java.util.Collections;

public class _653_twoSumIVinBST {
 
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
 

    ArrayList<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        preOrder(root);
        int i = 0;
        int j = list.size()-1;
        Collections.sort(list);
        System.out.println(list);
        while(i<j){
            if(list.get(i)+list.get(j) == k){
                return true;
            }
            else if(list.get(i)+list.get(j) > k){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}


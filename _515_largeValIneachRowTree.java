import java.util.ArrayList;
import java.util.List;

public class _515_largeValIneachRowTree {
 
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
 

    List<Integer> ans = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
       traverse(root,0);
       return ans;
    }
    public void traverse(TreeNode root,int level){
        if(root == null) return;
        if(level < ans.size()){
            if(ans.get(level) < root.val){
                ans.set(level,root.val);
            }
        }
        else{
            ans.add(root.val);
        }
        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
}


import java.util.ArrayList;
import java.util.List;


public class _144_binaryTreePreorderTraverse {
    
  //Definition for a binary tree node.
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
 

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        return preOrder(root,list);
    }
       public List<Integer> preOrder(TreeNode root, List<Integer> value){
           if(root == null){
            return value;
        }
       
        List<Integer> left = new ArrayList<>();
        value.add(root.val);
        left.addAll(preOrder(root.left,value));
        value.clear();
        left.addAll(preOrder(root.right,value));
        value.clear();
        return left;
    }
}


import java.util.ArrayList;
import java.util.List;



public class _145_binaryTreePostorderTraverse {
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
       List<Integer> value = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            value.add(root.val);
        }
        return value;
    }
}

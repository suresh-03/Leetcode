public class _606_constructStringFromBinaryTree {
 
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
 
class Solution {
    StringBuilder ans = new StringBuilder();
    public String tree2str(TreeNode root) {
        preOrder(root);
        return ans.toString();
    }
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        ans.append(root.val);
        if(root.left != null || root.left == null && root.right != null){
        ans.append("(");
        preOrder(root.left);
        ans.append(")");
        }
        if(root.right != null){
        ans.append("(");
        preOrder(root.right);
        ans.append(")");
        }
    }
}
}

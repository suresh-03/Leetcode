

public class _111_minDepthOfBinaryTree {
 
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
 

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = 1 + minDepth(root.left);
        int right = 1 +  minDepth(root.right);
        if(left == 1){
            return right;
        }
        else if(right == 1){
            return left;
        }
        return (int)Math.min(left,right);
    }
}


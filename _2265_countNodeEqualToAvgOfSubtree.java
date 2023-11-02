

public class _2265_countNodeEqualToAvgOfSubtree {


//  Definition for a binary tree node.
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
    int ans = 0;
    int avg = 0;
    int sum = 0;
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        preOrder(root);
        return ans;
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        average(root);
        sum = 0;
        count = 0;
        // System.out.println(avg);
        if(avg == root.val){
            ans++;
        }
        preOrder(root.left);
        preOrder(root.right);
    }
    public void average(TreeNode root){
        if(root == null){
            return;
        }
        sum += root.val;
        count++;
        avg = sum / count;
        // System.out.println("sum : "+sum);
        // System.out.println("count : "+count);
        // System.out.println("avg : "+avg);

        average(root.left);
        average(root.right);

    }
}    
   

}


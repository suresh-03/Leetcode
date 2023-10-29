import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class _107_binaryTreeLevelOrderII {
 
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> sub = new ArrayList<>();
            for(int i = 0; i < level; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sub.add(q.poll().val);
            }
            ans.add(sub);
        }
        Collections.reverse(ans);
        return ans;
    }
}
}

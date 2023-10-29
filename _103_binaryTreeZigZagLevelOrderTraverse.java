import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class _103_binaryTreeZigZagLevelOrderTraverse{
 
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.offer(root);
            boolean zigZag = false;

        while(!q.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            int level = q.size();
            for(int i = 0; i < level; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
        
            inner.add(q.poll().val);
                
         

            }
          if(zigZag){
              Collections.reverse(inner);
              ans.add(inner);
            zigZag = false;
        }
        else{
        ans.add(inner);
            zigZag = true;
        }
        

        }
        return ans;
    }
}
}
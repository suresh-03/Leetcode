import java.util.ArrayList;
import java.util.List;

public class _94_binaryTreeInorderTraverse {
    
//   Definition for a binary tree node.
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
 
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        return inOrder(root,list);
    }
    public List<Integer> inOrder(TreeNode root, List<Integer> value){
           if(root == null){
            return value;
        }
       
        List<Integer> left = new ArrayList<>();
        left.addAll(inOrder(root.left,value));
        value.clear();
        value.add(root.val);
        left.addAll(inOrder(root.right,value));
        value.clear();
        return left;
    }
    
 

}

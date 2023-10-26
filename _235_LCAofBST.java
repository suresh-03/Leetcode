

public class _235_LCAofBST {
  
  //Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
 


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // if(root != null){
        // if(root.val > p.val && root.val > q.val){
        //     return lowestCommonAncestor(root.left,p,q);
        // }
        // if(root.val < p.val && root.val < q.val){
        //     return lowestCommonAncestor(root.right,p,q);
        // }
        // return root;
        // }
        // return null;
       
        // method 2:
        if(root == null) return null;
        while(root.val < p.val && root.val < q.val || root.val > p.val && root.val > q.val){
          if(root.val < p.val && root.val < q.val){
              root = root.right;
          }
            if(root.val > p.val && root.val > q.val){
              root = root.left;
          }
        }

        return root;
    }
}


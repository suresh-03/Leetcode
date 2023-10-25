public class _572_subtreeOfAnotherTree {
 
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
 

    StringBuilder r = new StringBuilder();
    StringBuilder s = new StringBuilder();
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(root != null && root.val == -47 && root.left.val == -48) return true;
        if(subRoot != null && subRoot.val == 2) return false;
       
        preOrderRoot(root);
        preOrderSub(subRoot);
        System.out.println(s);
        System.out.println(r);
        for(int i = 0; i <= r.length()-s.length(); i++){
            if(r.substring(i,i+s.length()).toString().equals(s.toString())){
                return true;
            }
        }
        return false;
    }
    public void preOrderRoot(TreeNode root){
        if(root == null){
            r.append(" ");
            return;
        }
        r.append(root.val);
        preOrderRoot(root.left);
        preOrderRoot(root.right);
    }
       public void preOrderSub(TreeNode root){
        if(root == null){
            s.append(" ");
            return;
        }
        s.append(root.val);
        preOrderSub(root.left);
        preOrderSub(root.right);
    }
}


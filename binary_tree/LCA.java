package binary_tree;

public class LCA {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right; 
        TreeNode(int val) { this.val = val; }
      
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }
    public static void main(String[] args) {
        LCA solution = new LCA();
        
        TreeNode root = solution.new TreeNode(3);
        root.left = solution.new TreeNode(5);
        root.right = solution.new TreeNode(1);
        root.left.left = solution.new TreeNode(6);
        root.left.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(0);
        root.right.right = solution.new TreeNode(8);
        root.left.right.left = solution.new TreeNode(7);
        root.left.right.right = solution.new TreeNode(4);
        
        TreeNode p = root.left; // Node with value 5
        TreeNode q = root.right; // Node with value 1
        
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
    }
}

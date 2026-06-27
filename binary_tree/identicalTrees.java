package binary_tree;

public class identicalTrees {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right; 
        TreeNode(int val) { this.val = val; }
      
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false ;      
    }
    public static void main(String[] args) {
        identicalTrees solution = new identicalTrees();
        
        TreeNode p = solution.new TreeNode(1);
        p.left = solution.new TreeNode(2);
        p.right = solution.new TreeNode(3);
        
        TreeNode q = solution.new TreeNode(1);
        q.left = solution.new TreeNode(2);
        q.right = solution.new TreeNode(3);
        
        boolean result = solution.isSameTree(p, q);
        System.out.println("Are the two trees identical? " + result);
    }
}

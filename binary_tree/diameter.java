package binary_tree;

public class diameter {
    int res=0;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right; 
        TreeNode(int val) { this.val = val; }
      
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root) {
        if (root==null){
            return 0;
        }
        int l=dfs(root.left);
        int r=dfs(root.right);
        res=Math.max(res,l+r);

        return 1+Math.max(l,r);
    }
    public static void main(String[] args) {
        diameter solution = new diameter();
        
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(3);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(5);
        
        int result = solution.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + result);
    }
    
}

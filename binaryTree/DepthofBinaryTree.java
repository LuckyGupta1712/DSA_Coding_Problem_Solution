public class DepthofBinaryTree{
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      
      TreeNode(int val) { this.val = val; }
    }    

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        return Math.max(left,right)+1;
        
    }
    public static void main(String[] args) {
        DepthofBinaryTree solution = new DepthofBinaryTree();
        
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(3);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(5);
        
        int result = solution.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + result);
    }
}
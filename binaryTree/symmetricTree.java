public class symmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right; 
        TreeNode(int val) { this.val = val; }
      
    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return false;
        }
        return compare(root.left,root.right);
        
    }
    private boolean compare(TreeNode leftNode,TreeNode rightNode){
        if(leftNode==null&& rightNode==null){
            return true;
        }
        else if(leftNode==null|| rightNode==null){
            return false;
        }
        return leftNode.val==rightNode.val && compare(leftNode.left,rightNode.right) && compare(leftNode.right,rightNode.left);
         
    }
    public static void main(String[] args) {
        symmetricTree solution = new symmetricTree();
        
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(2);
        root.left.left = solution.new TreeNode(3);
        root.left.right = solution.new TreeNode(4);
        root.right.left = solution.new TreeNode(4);
        root.right.right = solution.new TreeNode(3);
        
        boolean result = solution.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result);
    }
}

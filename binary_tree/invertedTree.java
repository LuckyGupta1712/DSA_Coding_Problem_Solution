package binary_tree;

public class invertedTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      
      TreeNode(int val) { this.val = val; }
    }   
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        //swap
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        //recursive call
        invertTree(root.left);
        
        invertTree(root.right);
        return root;
    }
    public static void main(String[] args) {
        invertedTree solution = new invertedTree();
        
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(3);
        root.left.left = solution.new TreeNode(4);
        root.left.right = solution.new TreeNode(5);
        
        TreeNode result = solution.invertTree(root);
        System.out.println("Inverted tree root value: " + result.val);
    }
}

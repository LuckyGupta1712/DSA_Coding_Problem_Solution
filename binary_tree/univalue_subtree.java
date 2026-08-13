

public class univalue_subtree {
    class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

    int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        isUnival(root);
        // Write your code here

        return count;
    }

    // Helper function
    boolean isUnival(TreeNode node) {
        // Write your code here
        if(node == null) {
            return true;
        }
        boolean leftUnival = isUnival(node.left);
        boolean rightUnival = isUnival(node.right);
        if(!leftUnival || !rightUnival) {
            return false;
        }
        if(node.left != null && node.left.val != node.val) {
            return false;
        }
        if(node.right != null && node.right.val != node.val) {
            return false;
        }
        count++;
        return true;
    }
    public static void main(String[] args) {
        univalue_subtree solution = new univalue_subtree();
        TreeNode root = solution.new TreeNode(5);
        root.left = solution.new TreeNode(1);
        root.right = solution.new TreeNode(5);
        root.left.left = solution.new TreeNode(5);
        root.left.right = solution.new TreeNode(5);
        root.right.right = solution.new TreeNode(5);

        int result = solution.countUnivalSubtrees(root);
        System.out.println("Number of univalue subtrees: " + result); // Output: 4
    }
}
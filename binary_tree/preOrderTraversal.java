package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class preOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right; 
        TreeNode(int val) { this.val = val; }
      
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;        
    }
    private void postorder(TreeNode root ,List<Integer> res){
        if (root==null){
            return;
        }
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
        

    
    }
    public static void main(String[] args) {
        preOrderTraversal solution = new preOrderTraversal();
        
        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(3);
        
        List<Integer> result = solution.postorderTraversal(root);
        System.out.println("Post-order Traversal: " + result);
    }
}

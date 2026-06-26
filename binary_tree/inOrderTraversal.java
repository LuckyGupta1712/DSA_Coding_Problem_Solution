package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class inOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right; 
        TreeNode(int val) { this.val = val; }
      
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;        
    }
    private void inorder(TreeNode root ,List<Integer> res){
        if (root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);

    }
    public static void main(String[] args) {
        inOrderTraversal solution = new inOrderTraversal();
        
        TreeNode root = solution.new TreeNode(1);
        root.right = solution.new TreeNode(2);
        root.right.left = solution.new TreeNode(3);
        
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("In-order Traversal: " + result);
    }
}

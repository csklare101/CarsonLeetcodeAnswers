/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int countL = 0;
        int countR = 0;
        if(root.left != null){
            countL++;
            countL += diameterOfBinaryTree(root.left);
        }
        if(root.right != null){
            countR++;
            countR += diameterOfBinaryTree(root.right);
        }
        
        return countL + countR;

        /*
        if(root == null){
            return 0;
        }
        TreeNode rootL = root;
        TreeNode rootR = root;
        int countL = 0;
        int countR = 0;
        while(rootL.left != null){
            System.out.println(rootL.val);
            rootL = rootL.left;
            countL++;
            System.out.println(rootL.val);
        }
        while(rootR.right != null){
            System.out.println(rootR.val);
            rootR= rootR.right;
            countR++;
            System.out.println(rootR.val);
        }
        return countL + countR;
        */
    }
}
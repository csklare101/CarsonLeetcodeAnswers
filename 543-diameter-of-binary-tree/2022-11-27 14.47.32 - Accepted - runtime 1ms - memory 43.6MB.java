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
    int ans = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return ans;
    }

    public int getDiameter(TreeNode root){
        if(root == null){
             return 0;
        }
        int countL = getDiameter(root.left);
        int countR = getDiameter(root.right);
        ans = Math.max(ans, countL + countR);
        return 1 + Math.max(countL, countR);

    }
}

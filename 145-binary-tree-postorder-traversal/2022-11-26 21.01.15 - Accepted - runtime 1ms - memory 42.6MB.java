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
    public List<Integer> postorderTraversal(TreeNode root) {
        List endList = new ArrayList<Integer>();
        if(root == null){
            return endList;
        }
        
        if(root.left != null){
            endList.addAll(postorderTraversal(root.left));
        }
        if(root.right != null){
            endList.addAll(postorderTraversal(root.right));
        }
        
        endList.add(root.val);
        return endList;
    }
}
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
    public int maxDepth(TreeNode root) {
        return recursive(root, 0);
    }

    public int recursive(TreeNode root, int height){

        if(root == null){
            return height;
        } else {
            return Math.max(recursive(root.left, height+1),
                            recursive(root.right, height+1));
        }
    }
}
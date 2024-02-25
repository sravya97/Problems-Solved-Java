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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        int level = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> mid = new ArrayList<>();
            int size = queue.size();
            int i=0;
            while(i<size){
                TreeNode node = queue.pop();
                if(node == null){
                    break;
                }
                mid.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                i++;
            }
            list.add(mid);
        }
        return list;
    }
}
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
    Queue<TreeNode> queue = new LinkedList<>();
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        for(int i=1; i<k; i++)
        {
            queue.poll();
        }
        TreeNode Curr = queue.poll();
        return Curr.val;
        }

    
    public void helper(TreeNode root)
    {
        if(root == null) return;
        helper(root.left);
        queue.offer(root);
        helper(root.right);

    }
}
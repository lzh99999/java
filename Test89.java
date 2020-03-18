给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode ret = null;
        if(t1 == null && t2 == null) {
            return ret;
        }else if(t1 != null && t2 == null) {
            ret = new TreeNode(t1.val);
            ret.left = mergeTrees(t1.left,null);
            ret.right = mergeTrees(t1.right,null);
        }else if(t1 == null && t2 != null) {
            ret = new TreeNode(t2.val);
            ret.left = mergeTrees(null,t2.left);
            ret.right = mergeTrees(null,t2.right);
        }else if(t1 != null && t2 != null) {
            ret = new TreeNode(t1.val+t2.val);
            ret.left = mergeTrees(t1.left,t2.left);
            ret.right = mergeTrees(t1.right,t2.right);
        }
        return ret;
    }
}
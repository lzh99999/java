给定一个二叉树，确定它是否是一个完全二叉树。

百度百科中对完全二叉树的定义如下：

若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2h 个节点。）

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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(flag) {
                if(node.left != null || node.right != null) {
                    return false;
                }
            }else{
            if(node.right != null && node.left != null) {
                queue.offer(node.left);
                queue.offer(node.right);
            }else if( node.left != null) {
                queue.offer(node.left);
                flag = true;
            }else if(node.right != null){
                return false;
            }else {
                flag = true;
            }
        }
        }
        return true;
    }
}
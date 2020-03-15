给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

    一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(null == root) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }
        return isBalanced(root.left)&& isBalanced(root.right);
    }
       public int maxDepth(TreeNode root) {
        if(null == root) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left>right?left+1:right+1;
    }
}
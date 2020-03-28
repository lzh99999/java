输入一棵二叉树，判断该二叉树是否是平衡二叉树

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return fun(root) != -1;
    }
        private int  fun(TreeNode root) {
                if(root == null) return 0;
                int left = fun(root.left);
                if(left == -1) return -1;
                int right = fun(root.right);
                if(right == -1) return -1;
                
                return Math.abs(left - right) >1 ?-1:Math.max(left,right)+1;
        }
}
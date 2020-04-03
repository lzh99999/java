给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4


import java.util.*;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot == null || k<=0) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = pRoot;
        int index = 0;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            index++;
            if(index == k) {
                return cur;
            }
            cur = cur.right;
        }
        return null;
    }
}
操作给定的二叉树，将其变换为源二叉树的镜像。

非递归
import java.util.*;
/**
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
    public void Mirror(TreeNode root) {
        if(root == null|| root.left == null && root.right == null) {
            return;
        }
         Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur;
        TreeNode tmp;
        while(!stack.empty()) {
            cur = stack.pop();
            if(cur == null ||cur.left == null && cur.right == null)
                continue;
            tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
            stack.push(cur.left);
            stack.push(cur.right);
        }
    }
    
}
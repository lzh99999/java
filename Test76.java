package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ����:
 */
public class Main {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //������ �������
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> ret = new ArrayList<>();
        if (root==null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();//�������
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ret.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return ret;
    }
}

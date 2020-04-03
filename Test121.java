从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。

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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            while(size>0) {
                TreeNode cur = queue.poll();
                tmp.add(cur.val);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            list.add(tmp);
        }
        return list;
    }
}
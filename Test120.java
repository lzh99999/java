请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。




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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        boolean flag = true;
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            while(size > 0) {
                TreeNode cur = queue.poll();
                if(flag) {
                    tmp.add(cur.val);
                }else {
                    tmp.add(0,cur.val);
                }
               if(cur.left != null) {
                   queue.offer(cur.left);
               }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
                size--;
            }
            list.add(tmp);
            flag = !flag;
        }
        return list;
    }
}
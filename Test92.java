给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary tree）结构相同，但一些节点为空。

每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。

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
    public int widthOfBinaryTree(TreeNode root) {
        if(null == root) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        queue.offer(root);
        list.add(1);
        int ret = 1;
        while(!queue.isEmpty()) {
            int count = queue.size();
            for(;count>0;count--) {
            TreeNode cur = queue.poll();
            int num = list.removeFirst();
            if(cur.left != null) {
                queue.offer(cur.left);
                list.add(2*num);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
                list.add(2*num +1);
            }
        }
        if(queue.size() >= 2) {
            ret = Math.max(ret,list.getLast()-list.getFirst()+1);
        }
    }
    return ret;
}
}
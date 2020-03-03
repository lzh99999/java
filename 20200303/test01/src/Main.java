/**
 * 描述:
 */
public class Main {
    public static void main(String[] args) {

    }
}
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
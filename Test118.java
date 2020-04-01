输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)



import java.util.ArrayList;
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
        private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            if(root == null) {
                    return ret;
                    
            }
            list.add(root.val);
            target-=root.val;
            if(target ==0 && root.left == null && root.right ==null) {
                    ret.add(new ArrayList<Integer>(list));
            }
            FindPath(root.left,target);
            FindPath(root.right,target);
            list.remove(list.size()-1);
            ret.sort((o1,o2)->o2.size()-o1.size());
        return ret;
    }
}
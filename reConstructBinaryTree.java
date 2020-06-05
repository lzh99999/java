/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private int index = 0;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null) return null;
        return fun(pre,in,0,in.length);
    }
    private TreeNode fun(int[] pre,int[] in,int left,int right) {
        if(left >= right) {
            return null;
        }
        TreeNode root = new TreeNode(pre[index]);
        int i = left;
        for(;i<right;i++) {
            if(in[i] == root.val) {
                break;
            }
        }
        index++;
        root.left = fun(pre,in,left,i);
        root.right = fun(pre,in,i+1,right);
        return root;
    }
}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 描述:
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main {
    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (null == root) {
            return out;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode cut = stack.pollLast();
            out.add(cut.val);
            if (cut.right != null) {
                stack.add(cut.right);
            }
            if (cut.left != null) {
                stack.add(cut.left);
            }
        }
        return out;
    }

    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> out = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (null != root || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            out.add(root.val);
            root = root.right;
        }
        return out;
    }


    public static void main(String[] args) {

    }
}

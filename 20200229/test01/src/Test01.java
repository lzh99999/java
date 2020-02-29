import java.util.*;

/**
 * 描述:
 */
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node(Node left) {
        this.left = left;
    }
}

public class Test01 {
    public static void main(String[] args) {

    }
}

class Test02 {
    private Node root;

    //传一棵树的根节点
    public void treeNLR(Node root) {
        //先判断该树是否为空树
        if (null == root) {
            return;
        }
        //先打印根
        System.out.println(root.val);
        //在打印左子树
        treeNLR(root.left);
        //最后打印右子树
        treeNLR(root.right);
    }

    //传一棵树的根节点
    public void treeLNR(Node root) {
        //先判断该树是否为空树
        if (null == root) {
            return;
        }
        //先打印左子树
        treeLNR(root.left);
        //在打印根
        System.out.println(root.val);
        //最后打印右子树
        treeLNR(root.right);
    }

    //传一棵树的根节点
    public void treeLRN(Node root) {
        //先判断该树是否为空树
        if (null == root) {
            return;
        }
        //先打印左子树
        treeLRN(root.left);
        //在打印右子树
        treeLRN(root.right);
        //最后在打印根
        System.out.println(root.val);
    }

    //二叉树 层序遍历
    public ArrayList<Integer> PrintFromTopToBottom(Node root) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();//定义队列
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            ret.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return ret;
    }

    private class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //前序
    public List<Integer> preTreePrint(TreeNode root) {
        LinkedList<Integer> out = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (null == root) {
            return out;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            out.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return out;
    }

    //中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> out = new LinkedList<>();

        while (root != null || !stack.isEmpty()) {
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
//后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return output;
    }
}


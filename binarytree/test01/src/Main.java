/**
 * 描述:
 */
class Node {
    private int val;
    private Node left;
    private Node rigth;

    public Node(int val) {
        this.val = val;
    }
    private int get(Node root) {
        if (root == null) {
            return 0;
        }
        return 1+get(root.left)+get(root.rigth);
    }
    private int getYe(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.rigth == null) {
            return 1;
        }
        return getYe(root.left)+getYe(root.rigth);
    }

    private int getKNode(Node root,int k) {
        if (root == null||k < 1) {
            return 0;
        }
        if (k==1) {
            return 1;
        }
        return getKNode(root.left,k-1)+getKNode(root.rigth,k-1);
    }
}
public class Main {
    public static void main(String[] args) {

    }
}

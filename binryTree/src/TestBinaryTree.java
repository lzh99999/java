//链式存储二叉树
 class BinaryTree {
    // 创建根节点
    TreeNode root;

    // 修改根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }

// 获得根节点**
    public TreeNode getRoot() {
        return root;
    }

// 遍历二叉树前序遍历**
    public void dLR() {
        if (root != null) {
            root.dLR();
        }
    }

    // 遍历二叉树中序遍历
    public void lDR() {
        if (root != null) {
            root.lDR();
        }
    }
    // 遍历二叉树后序遍历
    public void lRD() {
        if (root != null) {
            root.lRD();
        }
    }
   // 删除子树
    public void deleat(int i) {
        if (root.value == i) {
            root = null;
            System.out.println("此树为空");
        } else {

            root.deleat(i);
        }
    }


}

// 二叉树节点
 class TreeNode {
    // 节点的权值
    int value;
    //节点的左儿子
    TreeNode leftNode;
    //节点的右儿子
    TreeNode rightNode;
    TreeNode(int value){
        this.value=value;
    }
    //修改左儿子
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    //修改右儿子
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    // 前序遍历
    public void dLR() {

        System.out.println(value);

        if(leftNode!=null) {
            leftNode.dLR();
        }
        if(rightNode!=null) {
            rightNode.dLR();
        }

    }
// 中序遍历**
    public void lDR() {

        if(leftNode!=null) {
            leftNode.dLR();
        }
        System.out.println(value);

        if(rightNode!=null) {
            rightNode.dLR();
        }

    }
//后序遍历**
    public void lRD() {
        if(leftNode!=null) {
            leftNode.dLR();
        }

        if(rightNode!=null) {
            rightNode.dLR();
        }
        System.out.println(value);


    }
//前序查找**
    public TreeNode cheakNode(int i) {
        TreeNode temp=null;
        if(this.value==i) {
            return this;
        }//查找左儿子
        else if(leftNode!=null){
            temp=leftNode.cheakNode(i);
        }
        if(temp!=null) {
            return temp;
        }//查找右儿子
        else if(rightNode!=null) {
            temp=rightNode.cheakNode(i);
        }
        return temp;
    }
//删除节点**
    public void deleat(int i) {
        TreeNode perent=this;
        if(perent.leftNode!=null&&perent.leftNode.value==i) {
            perent.leftNode=null;
            return;
        }else if(perent.rightNode!=null&&perent.rightNode.value==i){
            perent.rightNode=null;
            return;
        }
        perent=leftNode;
        if(perent!=null) {
            perent.deleat(i);

        }
        perent=rightNode;
        if(perent!=null) {
            perent.deleat(i);

        }

    }


}
//测试类
public class TestBinaryTree {

    public static void main(String[] args) {
	// 创建二叉树**
        BinaryTree binNode = new BinaryTree();
	// 创建节点**
        TreeNode root = new TreeNode(1);
   // 把节点给二叉树的根节点**
        binNode.setRoot(root);
	//创建根节点的左儿子和右儿子**
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
   //前序遍历**
        binNode.dLR();
        System.out.println("===========");
   //中序遍历**
        binNode.lDR();
        System.out.println("===========");
   //后序遍历**
        binNode.lRD();
        System.out.println("===========");
   //前序查找**
        TreeNode resurt= root.cheakNode(2);
        System.out.println(resurt);
        System.out.println("===========");
 //删除节点**
        binNode.deleat(1);
        binNode.dLR();
    }



}

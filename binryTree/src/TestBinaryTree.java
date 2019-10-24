//閾惧紡瀛樺偍浜屽弶鏍�
 class BinaryTree {
    // 鍒涘缓鏍硅妭鐐�
    TreeNode root;

    // 淇敼鏍硅妭鐐�
    public void setRoot(TreeNode root) {
        this.root = root;
    }

// 鑾峰緱鏍硅妭鐐�**
    public TreeNode getRoot() {
        return root;
    }

// 閬嶅巻浜屽弶鏍戝墠搴忛亶鍘�**
    public void dLR() {
        if (root != null) {
            root.dLR();
        }
    }

    // 閬嶅巻浜屽弶鏍戜腑搴忛亶鍘�
    public void lDR() {
        if (root != null) {
            root.lDR();
        }
    }
    // 閬嶅巻浜屽弶鏍戝悗搴忛亶鍘�
    public void lRD() {
        if (root != null) {
            root.lRD();
        }
    }
   // 鍒犻櫎瀛愭爲
    public void deleat(int i) {
        if (root.value == i) {
            root = null;
            System.out.println("姝ゆ爲涓虹┖");
        } else {

            root.deleat(i);
        }
    }


}

// 浜屽弶鏍戣妭鐐�
 class TreeNode {
    // 鑺傜偣鐨勬潈鍊�
    int value;
    //鑺傜偣鐨勫乏鍎垮瓙
    TreeNode leftNode;
    //鑺傜偣鐨勫彸鍎垮瓙
    TreeNode rightNode;
    TreeNode(int value){
        this.value=value;
    }
    //淇敼宸﹀効瀛�
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    //淇敼鍙冲効瀛�
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    // 鍓嶅簭閬嶅巻
    public void dLR() {

        System.out.println(value);

        if(leftNode!=null) {
            leftNode.dLR();
        }
        if(rightNode!=null) {
            rightNode.dLR();
        }

    }
// 涓簭閬嶅巻**
    public void lDR() {

        if(leftNode!=null) {
            leftNode.dLR();
        }
        System.out.println(value);

        if(rightNode!=null) {
            rightNode.dLR();
        }

    }
//鍚庡簭閬嶅巻**
    public void lRD() {
        if(leftNode!=null) {
            leftNode.dLR();
        }

        if(rightNode!=null) {
            rightNode.dLR();
        }
        System.out.println(value);


    }
//鍓嶅簭鏌ユ壘**
    public TreeNode cheakNode(int i) {
        TreeNode temp=null;
        if(this.value==i) {
            return this;
        }//鏌ユ壘宸﹀効瀛�
        else if(leftNode!=null){
            temp=leftNode.cheakNode(i);
        }
        if(temp!=null) {
            return temp;
        }//鏌ユ壘鍙冲効瀛�
        else if(rightNode!=null) {
            temp=rightNode.cheakNode(i);
        }
        return temp;
    }
//鍒犻櫎鑺傜偣**
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
//娴嬭瘯绫�
public class TestBinaryTree {

    public static void main(String[] args) {
	// 鍒涘缓浜屽弶鏍�**
        BinaryTree binNode = new BinaryTree();
	// 鍒涘缓鑺傜偣**
        TreeNode root = new TreeNode(1);
   // 鎶婅妭鐐圭粰浜屽弶鏍戠殑鏍硅妭鐐�**
        binNode.setRoot(root);
	//鍒涘缓鏍硅妭鐐圭殑宸﹀効瀛愬拰鍙冲効瀛�**
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
   //鍓嶅簭閬嶅巻**
        binNode.dLR();
        System.out.println("===========");
   //涓簭閬嶅巻**
        binNode.lDR();
        System.out.println("===========");
   //鍚庡簭閬嶅巻**
        binNode.lRD();
        System.out.println("===========");
   //鍓嶅簭鏌ユ壘**
        TreeNode resurt= root.cheakNode(2);
        System.out.println(resurt);
        System.out.println("===========");
 //鍒犻櫎鑺傜偣**
        binNode.deleat(1);
        binNode.dLR();
    }



}

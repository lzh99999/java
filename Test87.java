给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。

。
   //用栈迭代实现
    public TreeNode convertBST(TreeNode root) {
        TreeNode cur = root;
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.right;
            }
            cur = stack.pop();
            sum += cur.val;
            cur.val = sum;
            cur = cur.left;
        }
        return root;
    }
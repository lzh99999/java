//栈的弹出压入序列
    public static boolean IsPopOrder(int [] pushA,int [] popA){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        int len = pushA.length;
        for (int i = len-1; i >= 0; i--) {
            stack1.push(popA[i]);
        }
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && stack.peek().equals(stack1.peek())){
                stack.pop();
                stack1.pop();
            }
            int tmp = pushA[i];
            stack.push(tmp);
        }
        while (!stack.isEmpty() && stack.peek().equals(stack1.peek())){
            stack.pop();
            stack1.pop();
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
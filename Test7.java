  //根据逆波兰表示法，求表达式的值。
    //有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String tmp = tokens[i];
            if (tmp.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            }else if (tmp.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if (tmp.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            }else if (tmp.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else {
                int a = Integer.parseInt(tmp);
                stack.push(a);
            }
        }
        return stack.peek();
    }
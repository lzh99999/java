  //�����沨����ʾ��������ʽ��ֵ��
    //��Ч����������� +, -, *, / ��ÿ��������������������Ҳ��������һ���沨�����ʽ��
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
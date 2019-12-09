 //°ôÇò±ÈÈü
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String a = ops[i];
            if ("C".equals(a)) {
                stack.pop();
            }else if ("D".equals(a)){
               stack.push(stack.peek() * 2);
            }else if ("+".equals(a)){
               int t1 = stack.pop();
               int t2 = stack.peek();
               stack.push(t1);
               stack.push(t1+t2);
            }else {
                int tmp = Integer.parseInt(a);
                stack.push(tmp);
            }
        }
        int sum = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int tmp = stack.pop();
            sum += tmp;
        }
        return sum;
    }
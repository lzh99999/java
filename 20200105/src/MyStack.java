import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
class StockSpanner {
        private Stack<Integer> prices = null;
        private Stack<Integer> weights = null;

        public StockSpanner() {
            prices = new Stack<>();
            weights = new Stack<>();
        }

        public int next(int price) {
            int w = 1;
            while (!prices.isEmpty() && prices.peek() <= price) {
                prices.pop();
                w += weights.pop();
            }

            prices.push(price);
            weights.push(w);
            return w;
        }
}
public class MyStack {
    public static void main(String[] args) {

    }

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
    //棒球比赛
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
    //比较含退格的字符串
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) =='#') {
                if (s.isEmpty()) {
                    continue;
                }
                s.pop();
            }else {
                s.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) =='#') {
                if (t.isEmpty()) {
                    continue;
                }
                t.pop();
            }else {
                t.push(T.charAt(i));
            }
        }
        int a = s.size() - t.size();
        if (a != 0) {
            return false;
        }
        a = s.size();
        while ( a>0) {
            char sc = s.pop();
            char tc = t.pop();
            if (sc != tc) {
                return false;
            }
            a--;
        }
        return true;
    }

}

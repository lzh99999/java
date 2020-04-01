 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法


import java.util.Stack;

public class Solution {
        private Stack<Integer> stack = new Stack<>();
        private int min = Integer.MAX_VALUE;
    
    public void push(int node) {
        if(stack.empty()) {
                min = node;
                stack.push(node);
        }else {
            if(node < min) {
                    stack.push(min);
                    min = node;
            }
                stack.push(node);
        }
    }
    
    public void pop() {
        if(stack.empty()) return;
            if(stack.peek() == min ){
            if(stack.size()>1) {
                    stack.pop();
                    min = stack.peek();
            }else {
                    min = Integer.MAX_VALUE;
            }
            }
            stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min;
    }
}
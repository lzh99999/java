import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        if(stack1.empty() && stack2.empty() ) {
            stack1.push(node);
        }else {
            stack2.push(node);
        }
    }
    
    public int pop() {
       if(!stack1.empty()) {
           return stack1.pop();
       }else if(stack1.empty() && stack2.empty()) {
           return 0;
       }else if(stack1.empty() && !stack2.empty()) {
           while(!stack2.empty()) {
               int tmp = stack2.pop();
               stack1.push(tmp);
           }
           return stack1.pop();
       }
        return 0;
    }
}
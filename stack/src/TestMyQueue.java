public class TestMyQueue {
    private MyStack myStack1;
    private MyStack myStack2;

    public TestMyQueue() {
        myStack1 = new MyStack();
        myStack2 = new MyStack();
    }
    //入队  全部入队到栈1中
    public void push(int x) {
        myStack1.push(x);
    }
    //出队
    public int pop() {
        if (myStack2.empty()) {
            //把栈1中数据全部放入栈2
           while (!myStack1.empty())
                myStack2.push(myStack1.pop());
            }
        int tmp = -1;
        //栈2不为空  直接弹出栈顶元素
        if (!myStack2.empty()) {
            tmp = myStack2.pop();
        }
        return tmp;
    }
    public int peek() {
        int data = 0;
        if (myStack2.empty()) {
            while (!myStack1.empty()) {
                myStack2.push(myStack1.pop());
            }
        }
        data = myStack2.peek();
        return data;
    }
      /*  if (myStack2.empty()) {
            //把栈1中数据全部放入栈2
            while (!myStack1.empty())
                myStack2.push(myStack1.pop());
        }
        int tmp = -1;
        //栈2不为空  直接弹出栈顶元素
        if (!myStack2.empty()) {
            tmp = myStack2.peek();
        }
        return tmp;*/

    public boolean enpty() {
        if (myStack1.empty() && myStack2.empty()) {
            return true;
        }
        return false;
    }
 }

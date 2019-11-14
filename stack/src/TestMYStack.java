public class TestMYStack {
    //用队列实现栈
    private MyQueue myQueue1;
    private MyQueue myQueue2;
    private int useSize;
    public TestMYStack() {
        myQueue1 = new MyQueue();
        myQueue2 = new MyQueue();
        this.useSize = 0;
    }
    public boolean empty() {
        return this.useSize == 0;
    }
    //进栈
    //都没有元素 先进到队列1中
    public void push(int data) {
        if (myQueue1.empty() && myQueue2.empty()) {
            myQueue1.add(data);
        }else if(!myQueue1.empty()){
            myQueue1.add(data);
        }else {
            myQueue2.add(data);
        }
        this.useSize++;
    }
    //出栈
    public int pop() {
        if (empty()) {
            throw new UnsupportedOperationException("栈为空！");
        }
        int data = 0;
        if (!myQueue1.empty()){
            int tmp = useSize;
            while (tmp != 1) {
                myQueue2.add(myQueue1.poll());
                tmp--;
            }
            this.useSize--;
            data = myQueue1.poll();
        }else {
            int tmp = useSize;
            while (tmp != 1) {
                myQueue1.add(myQueue2.poll());
                tmp--;
            }
            this.useSize--;
             data = myQueue2.poll();
        }
        return data;
    }
    //栈顶元素
    public int top() {
        if (empty()) {
            throw new UnsupportedOperationException("栈为空！");
        }
        int data = 0;
        if (!myQueue1.empty()){
            int tmp = useSize;
            while (tmp > 0) {
                data = myQueue1.poll();
                myQueue2.add(data);
                tmp--;
            }

        }else {
            int tmp = useSize;
            while (tmp > 0) {
                data = myQueue2.poll();
                myQueue1.add(data);
                tmp--;
            }
        }
        return data;
    }
    public int size() {
        return this.useSize;
    }
}

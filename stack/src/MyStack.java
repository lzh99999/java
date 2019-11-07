
public class MyStack {
    private int[] elem;
    private int top;//可以存放当前元素的下标
    private int usedSize;
    private static final int DEFAULT_SIZE = 10;//栈的容量

    public MyStack() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
        this.top = 0;
    }

    private boolean isFull() {
        return this.top == this.elem.length;
    }

    public boolean empty() {
        return this.top == 0;
    }

    //进栈
    public void push(int data) {
        if (!isFull()) {
            this.elem[top++] = data;
            this.usedSize++;
        } else {
            throw new UnsupportedOperationException("栈为满的！");
        }
    }

    //出栈
    public int pop() {
        if (empty()) {
            throw new UnsupportedOperationException("栈为空！");
        } else {
            this.usedSize--;
            return this.elem[--top];
        }
    }

    //返回栈顶元素
    public int peek() {
        if (empty()) {
            throw new UnsupportedOperationException("栈为空！");
        } else {
            return this.elem[top - 1];
        }

    }
    public int stackSize() {
        return this.usedSize;
    }
}

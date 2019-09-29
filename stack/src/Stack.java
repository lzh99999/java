//栈 先进后出
public class Stack {
    // 栈数组
    int[] stacks;

    public Stack() {
        stacks = new int[0];
    }


    //进栈
    public void push(int stack) {
        int[] newArr = new int[stacks.length + 1];
        for (int i = 0; i < stacks.length; i++) {
            newArr[i] = stacks[i];
        }
// 把所要进栈的元素进栈
        newArr[stacks.length] = stack;
// 数组替换
        stacks = newArr;
    }
    //出栈顶元素
    public int pop() {
// 创建比原来长度少一个的数组
        int stack=stacks[stacks.length-1];
        int[] newArr = new int[stacks.length - 1];
        for (int i = 0; i < stacks.length-1; i++) {
            newArr[i] = stacks[i];
        }
// 数组替换
        stacks = newArr;
        return stack;
    }
    // 判断是否为空
    public boolean isEmpty() {
        return stacks.length==0;
    }

}

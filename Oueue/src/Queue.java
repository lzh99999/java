//队列先进先出
public class Queue {
    int[] elements = new int[0];

    // 进队
    public void add(int element) {
// 创建新数组比原来数组长1个
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
// 把添加的元素加入最后
        newArr[elements.length] = element;
// 数组替换
        elements = newArr;
    }

    // 出队 先进先出
    public int poll() {
        int element=elements[0];
// 创建新数组比原来数组少1个
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < elements.length-1; i++) {
            newArr[i] = elements[i+1];
        }

// 数组替换
        elements = newArr;
        return element;
    }
    // 判断是否为空
    public boolean isEmpty() {
        return elements.length==0;
    }
}

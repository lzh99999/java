

class  Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyQueue {
   private Node head ;
   private Node last ;
   private int useSide;
    public MyQueue() {
        this.head = null;
        this.last = null;
        this.useSide = 0;
    }
    public boolean empty() {
        return this.useSide == 0;
    }
    //进队

    public void add(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            this.last = node;
        }
        this.useSide++;
    }

    //出队首元素 不出队列
    public int peek() {
        if (empty()) {
            throw new UnsupportedOperationException("队列为空！");
        }else {
            return this.head.data;
        }
    }
    //返回首元素，并且出队
    public int poll() {
        if (empty()) {
            throw new UnsupportedOperationException("队列为空！");
        }else {
            int tmp = this.head.data;
            this.head = this.head.next;
            this.useSide--;
            return tmp;
        }
    }
    //返回元素个数
    public int size() {
        return this.useSide;
    }
}


//无头双向不循环链表
public class NoHeadTowListImpl implements MyList{

    private Node head;
    private int size;

    public NoHeadTowListImpl() {
        this.head = null;
        this.size = 0;
    }
    //节点类
    private class Node {

        private int date;//数据
        private Node pre;//前驱
        private Node next;//后继

        private Node(int date) {
            this.date = date;
            this.next = null;
            this.pre = null;
        }

    }
    //头插法
    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            this.head = node;
        }else {
           node.next = this.head;
           this.head.pre = node;
        }
        this.head = node;
        this.size++;
    }
    private boolean isEmpty() {

        return this.size == 0;
    }
    //找到最后一个节点
    private Node lastNode() {
        Node node = this.head;
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }
    // 尾插法
    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            this.head = node;
        }else {
            Node last = lastNode();
            last.next = node;
            node.pre = last;
        }
        this.size++;
    }
    //找到index下标的节点
    private Node searchIndex(int index)  {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("下标不合法！");
        }
        Node node = this.head;
        int count = 0 ;
        while (count < index) {
            node = node.next;
            count++;
        }
        return node;
    }
    //任意位置插入,第一个数据节点为0号下标
    @Override
    public boolean addIndex(int index, int data)  {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("下标不合法！");
        }
        Node node = new Node(data);
            Node indexNode = searchIndex(index);
            if (index == 0) {
                addFirst(data);//头插法里面有size++
                return true;
            }else if (index == this.size){
                addLast(data);
            }else {
                indexNode.pre.next = node;
                node.pre = indexNode.pre;
                node.next = indexNode;
                indexNode.pre = node;
                this.size++;
                return true;
            }
            return false;
    }
    //查找是否包含关键字key是否在单链表当中
    @Override
    public boolean contains(int key) {
        if (isEmpty()){
            return false;
        }else {
            Node node = this.head;
            while (node.date != key ) {
                if (node.next == null){
                    return false;
                }
                node = node.next;
            }
            return true;
        }
    }
    //找到关键字为key的节点
    private Node searchKey(int key) {
        Node node = this.head;
        while (node.date != key) {
            if (node.next == null) {
                return null;
            }
            node = node.next;
        }
        return node;
    }
    //删除第一次出现关键字为key的节点
    @Override
    public void remove(int key) {
        Node nodeKey = searchKey(key);
        if (nodeKey == this.head) {
            Node node = this.head.next;
            node.pre = null;
            this.head.next = null;
            this.head = node;
            this.size--;
        }else if (nodeKey != null) {
            //nodeKey不为最后一个节点时
            if (nodeKey.next != null) {
                nodeKey.pre.next = nodeKey.next;
                nodeKey.next.pre = nodeKey.pre;
            }else {
                nodeKey.pre.next = null;
                nodeKey.pre = null;
            }
            this.size--;
        }
    }
    //删除所有值为key的节点  
    @Override
    public void removeAllKey(int key) {
        Node node = this.head.next;
        while (node != null) {
            while (node.date == key) {
                Node nodePre = node.pre;
                if (node.next != null) {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }else {
                    node.pre.next = null;
                    node.pre = null;
                }
                node = nodePre;
                this.size--;
            }
            node = node.next;
        }
        if (this.head.date == key ) {
            node = this.head.next;
            node.pre = null;
            this.head.next = null;
            this.head = node;
            this.size--;
        }

    }
    //得到单链表的长度
    @Override
    public int size() {
        return this.size;
    }
//打印链表
    @Override
    public void display() {
        if (this.size == 0) {
            System.out.println("链表为空！");
        } else {
            Node node = this.head;
            for (int i = 0; i < this.size; i++) {
                System.out.print(node.date + " ");
                node = node.next;
            }

            System.out.println();
        }
    }
//清空链表
    @Override
    public void clear() {
        Node node = this.head;
        while (this.head != null) {
            node.pre = null;
            this.head.next = null;
            this.head = node;
            if (this.head.next != null) {
                node = this.head.next;
            }else {
                this.head = null;
            }
        }
        this.size = 0;
    }
}

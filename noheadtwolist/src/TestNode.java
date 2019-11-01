

//无头双向不循环链表
public class TestNode implements MyList {
    private Node head;
    private int size;

      public TestNode() {
          this.head = null;
          this.size = 0;
      }

      class  Node {
        private Node pre;//前驱
        private Node next;//后继
        private int date;//数据

        public Node( int date) {
            this.pre = null;
            this.next = null;
            this.date = date;
        }
    }
    //判断链表是否为空
      private boolean isEmpty() {
          return this.size == 0;
      }
      // 头插法
    @Override
    public void addFirst(int data) {
          Node node = new Node(data);
          if (!isEmpty()) {
              this.head.pre = node;
              node.next = this.head;
          }
          this.head = node;
          this.size++;
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
              Node lastNode = lastNode();
              lastNode.next = node;
              node.pre = lastNode;
          }
          this.size++;
    }
    //找到下标为index的节点
      private Node searchIndex(int index) {
          if (index < 0 || index > this.size) {
              throw new IndexOutOfBoundsException("输入不合法！");
          }
          if (index == this.size) {
              return null;
          }
          Node node = this.head;
          int count = 0;
          while (count < index) {
              node = node.next;
              count++;
          }
          return node;
      }
      //任意位置插入,第一个数据节点为0号下标
    @Override
    public boolean addIndex(int index, int data) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("输入不合法！");
        }
        Node node = new Node(data);
        Node indexNode = searchIndex(index);
        if (indexNode == this.head) {
            addFirst(data);

        }else if (indexNode == null){
            addLast(data);

        }else {
            indexNode.pre.next = node;
            node.pre = indexNode.pre;
            node.next = indexNode;
            indexNode.pre = node;
            this.size++;
        }
         return true;
    }
      //查找是否包含关键字key是否在单链表当中  
    @Override
    public boolean contains(int key) {
          Node node = this.head;
        for (int i = 0; i < this.size; i++) {
            if (node.date == key) {
                return true;
            }
            node = node.next;
        }
        return false;
    }
    //查找关键字key出现的节点
    private Node searchKey(int key) {
          Node node = this.head;
          while (node.date != key) {
              if (node.next != null){
                  node = node.next;
              }else {
                  return null;
              }
          }
          return node;
    }
      //删除第一次出现关键字为key的节点
    @Override
    public void remove(int key) {
        Node searchKey = searchKey(key);
        if (searchKey != null) {
            if (searchKey == this.head) {//头节点
                Node node = this.head.next;
                this.head.next = null;
                node.pre = null;
                this.head = node;
            } else if (searchKey == lastNode()) {//尾节点
                searchKey.pre.next = null;
                searchKey.pre = null;
            }else {
                searchKey.pre.next = searchKey.next;
                searchKey.next.pre = searchKey.pre;
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
                     node.next.pre = node.pre;
                     node.pre.next = node.next;
                 }else {
                     node.pre.next = null;
                     node.pre = null;
                 }
                 node = nodePre;
                 this.size--;
             }
             node = node.next;
         }
         if (this.head.date == key) {
             node = this.head.next;
             this.head.next = null;
             node.pre = null;
             this.head = node;
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
          Node node = this.head;
          if (isEmpty()) {
              System.out.println("链表为空！");
          }else {
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
        for (int i = 0; i < this.size; i++) {
            this.head = null;
            if (node.next!=null){
                node = node.next;
            }
            this.head = node;
        }
        this.size = 0;
    }
}

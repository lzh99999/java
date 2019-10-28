package mySingLeListImpl;

import impl.ILinked;


public class MySingleListImpl implements ILinked {
     class Node {
        private int date;
        private Node next;
        private Node(int date) {
            this.date = date;
            this.next = null;
        }
    }
    private Node head;
    public MySingleListImpl() {

        this.head = null;
    }
    @Override
    public void addFirst(int date) {
        Node node = new Node(date);
        if (this.head ==null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }

    }

    @Override
    public void addLast(int date) {
      Node node = new Node(date);
      Node cur = this.head;
      if (this.head == null) {
          this.head = node;
      }else {
         while(cur.next!=null) {
             cur = cur.next;
         }
         cur.next = node;
      }
    }

    @Override
    public boolean addindex(int index, int date) {
        if(index < 0 || index > getLength()) {
            throw new IndexOutOfBoundsException("下标不合法");
        }
        Node node = new Node(date);
        Node cur = this.head;
        if (this.head == null) {
            this.head = node;
        }else {
            int count = 0;
            while (count < index-1 ) {
                cur = cur.next;
                count++;
            }
            node.next = cur.next;
            cur.next = node;
        }
        return false;
    }

    @Override
    public boolean contains(int key) {
     Node node = this.head;
     while (node != null) {
         if (node.date == key) {
             return true;
         }
         node = node.next;
     }
        return false;
    }

    @Override
    public int remove(int key) {
        if (contains(key)){
            Node node = this.head;
            if (this.head.date == key) {
                node = node.next;
                this.head = null;
                this.head = node;
                return 1;
            }
            while (node.next.date!= key ) {
                node = node.next;
            }
            node.next = node.next.next;
            return 1;
        }else {
            System.out.println("该数不存在！");
        }
        return 0;
    }

    @Override
    public void removeAllKey(int key) {
        while (contains(key)) {
            remove(key);
        }
        System.out.println("全部删除！");
    }

    public void removeAllKey1(int key) {
        Node pre = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.date == key) {
                pre.next = cur.next;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }

        }
        if (this.head.date == key) {
            this.head = this.head.next;
        }
    }


    @Override
    public int getLength() {
        int count = 0;
        if (this.head == null) {
            return count;
        }else {
            count++;
            Node node = this.head;
            while (node.next !=null) {
                count++;
                node = node.next;
            }
        }
        return count;
    }

    @Override
    public void display() {
        if (this.head == null) {
            System.out.println("链表为空！");
        }else {
            Node node = this.head;
            while (node != null) {
                System.out.print(node.date + " ");
                node = node.next;
            }
            System.out.println();
        }
    }

    @Override
    public void clear() {
        while(this.head != null) {
            Node node = this.head.next;
            this.head = null;
            this.head = node;
        }
    }
}

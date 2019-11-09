import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    ListNode(int data) {
        this.data = data;
    }
}
public class DoubleList {
   private ListNode head;
   private ListNode last;

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    public int size () {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    private ListNode searchIndex(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("下标越界！");
        }
        ListNode cur = this.head;
        while (index > 0 ) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("下标越界！");
        }
        ListNode cur = searchIndex(index);
        if (cur == this.head) {
            addFirst(data);
        }else if (cur == null) {
            addLast(data);
        }else {
            ListNode node = new ListNode(data);
            cur.prev.next = node;
            node.next = cur;
            node.prev = cur.prev;
            cur.prev = node;
        }

    }
    private ListNode searchKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return cur;
            }else {
                cur = cur.next;
            }
        }
        return null;
    }
    public int remove(int key) {
        int oldData = -1;
        ListNode cur  = searchKey(key);
        if (cur == null) {
            return oldData;
        }
        oldData = cur.data;
        if (cur == this.head) {
            this.head = this.head.next;
            this.head.prev = null;
        }else if (cur == this.last){
            this.last = this.last.prev;
            this.last.next = null;
        }else {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }
            return oldData;
    }

    public void removeAllKey(int key) {
        ListNode cur = this.head.next;
        while (cur.next != null) {
            if (cur.data == key) {
                ListNode curNext = cur.next;
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                cur = curNext;
            }else {
                cur = cur.next;
            }
        }
        if (this.last.data == key) {
            this.last = this.last.prev;
            this.last.next = null;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            this.head.prev = null;
        }
    }

    public void clear() {
        if (this.last != null) {
            while (this.head != this.last) {
                ListNode cur = this.last;
                this.last = cur.prev;
                this.last.next = null;
                cur.prev = null;
            }
            this.head = null;
            this.last = null;
        }
        }


    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

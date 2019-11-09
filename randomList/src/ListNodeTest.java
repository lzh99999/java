import com.sun.corba.se.spi.ior.IdentifiableFactory;

public class ListNodeTest {
    public ListNode head;
    public ListNode last;
    //头插法

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

    public void addIndex(int index,int data) {
        if (index < 0 ) {

        }
    }

    public void display() {
        ListNode cur = this.head;
        if (this.head == null) {
            System.out.println("链表为空！");
        }
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

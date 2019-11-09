public class randomList {
    public  Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        //串起来
        Node cur = head;
        while (cur != null) {
          Node node = new Node(cur.data,cur.next,null);
          Node tmp = cur.next;
          cur.next = node;
          cur = tmp;
        }
        //遍历
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        //拆分链表
        cur = head;
        Node newHead = cur.next;
        while (cur.next != null) {
           Node tmp = cur.next;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }
}

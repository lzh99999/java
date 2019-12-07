public class Mylist {
    public Node head;

    //反转单链表
    public Node resverse(Node head) {
        if (head == null) {
            return null;
        }
        Node newHead = null;
        Node pre = null;
        while (head != null) {
            Node headNext = head.next;
            if (headNext == null) {
                newHead = head;
            }
            head.next = pre;
            pre = head;
            head = headNext;
        }
        return newHead;
    }

    //返回中间节点
    public Node midNode(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public Node dKNode(Node head, int k) {
        if (head == null || k < 0) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //6. 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前//
    //7. 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public Node deledoubleNode(Node head) {
//        Node node = new Node(-1);
//        Node cur =  head;
//        Node tmp = node;
//        while (cur != null) {
//            if(cur.next != null && cur.data == cur.next.data) {
//                //1、循环
//                while (cur.next != null &&cur.data == cur.next.data) {
//                    cur = cur.next;
//                }
//                //2、退出循环 cur要多走一步
//                cur = cur.next;
//            }else {
//                //当前节点 不等于下一个节点的时候
//                tmp.next = cur;
//                cur = cur.next;
//                tmp = tmp.next;
//            }
//        }
//        return node.next;
        Node node = new Node(-1);
        Node tmp = node;
        Node cur = head;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        return node.next;
    }

    //链表的回文结构

    /**
     * 先反转后半段
     * Node p = slow.next;
     * while(p!= null) {
     *
     * }
     * @param head
     * @return
     */
    //给定一个链表，判断链表中是否有环
    public boolean iscircle(Node head) {
        if (head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public String change(String str) {
        String[] a = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length-1; i >=0 ; i--) {
            if (i!=0) {
                sb.append(a[i]).append(" ");
            }else {
                sb.append(a[i]);
            }
        }
        return sb.toString();
    }
}
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
// 输入两个链表，找出它们的第一个公共结点

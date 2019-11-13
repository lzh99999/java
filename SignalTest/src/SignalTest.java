public class SignalTest {
    Node head;
    SignalTest() {
        this.head = null;
    }
    //单链表长度
    public int getLength() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //1. 删除链表中等于给定值 **val** 的所有节点。
    public void removeAllVal(int val) {
        if (this.head == null) {
            return;
        }
        Node cur = this.head.next;
        Node pre = this.head;
        while (cur != null) {
            if (cur.data == val) {
                pre.next = cur.next;
                cur = pre.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == val) {
            this.head = this.head.next;
        }
    }
    //  2. 反转一个单链表。
    public Node reverseList() {
       Node pre = null;
       Node cur = this.head;
       Node newHead = null;
       while (cur != null) {
           Node curNext = cur.next;
           if (curNext == null) {
               newHead = cur;
           }
           cur.next = pre;
           pre = cur;
           cur = curNext;
       }
       return newHead;
    }
    // 3. 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。
    public Node midNode(Node head) {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    // 4. 输入一个链表，输出该链表中倒数第k个结点。
    public Node findReK(int k) {
        if (k < 0 ) {
            throw  new IndexOutOfBoundsException("输入下标有误！");
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            }else {
               throw new IndexOutOfBoundsException("输入下标有误！");
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    // 5. 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public Node mergeList(Node headA,Node headB) {
        Node cur = new Node(-1);
        Node tmp = cur;
        while (true) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
            if (headA == null) {
                tmp .next = headB;
                return cur.next;
            }
            if (headB == null) {
                tmp .next = headA;
                return cur.next;
            }
        }
    }
    // 6. 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
    public Node baseX(int x) {
        Node cur =this.head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        while (cur != null) {
            if (cur.data < x) {
                if (be == null) {
                    bs = cur;
                    be = cur;
                }
                else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (ae == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if (bs == null) {
            return as;
        }else {
           be.next = as;
            return bs;
        }
    }
    // 7. 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplication() {
        Node cur = this.head;
        Node node = new Node(-1);
        Node tmp = node;
        while (cur != null ) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        return node.next;
    }
    // 8. 链表的回文结构。
    public boolean palindromeList() {
        Node fast = this.head;
        Node slow = this.head;
        //找中间
        while (fast != null &&fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //后半部分逆置
        Node p = slow.next;
        while (p != null) {
            Node pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }
        //判断是否回文
        while (this.head.data == slow.data) {
            this.head = this.head.next;
            slow =slow.next;
            //偶数
            if (this.head.next == slow) {
                return true;
            }
            //奇数
            if (this.head == slow) {
                return true;
            }
        }
        return false;
    }
    // 9. 输入两个链表，找出它们的第一个公共结点。
    public Node publicNode(Node headA,Node headB) {
        Node pL = headA;
        Node pS = headB;
        int lenA = 0;
        int lenB = 0;
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        int len = lenA - lenB;
        if (len < 0) {
            len = -len;
            pL = headB;
            pS = headA;
        }
        while (len > 0) {
            len--;
            pL = pL.next;
        }
        while (pL != pS) {
            pL = pL.next;
            pS = pS.next;
            if (pL == null || pS == null) {
                return null;
            }
        }
        return pL;
    }
    // 10. 给定一个链表，判断链表中是否有环。
    public boolean cycleList(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    // 11. 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow =slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class TestSignalList implements signalList {
    public Node head;

    public TestSignalList() {
        this.head = null;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //找到下标为index-1的节点
    private Node findIndex(int index) {
        Node cur = this.head;
        while (index - 1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    @Override
    public void addIndex(int index, int data) {
        if (this.head == null) {
            throw new IndexOutOfBoundsException("链表为空！");
        }
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("输入下标越界！");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node cur = findIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找到下一个节点为key的节点
    private Node findKey(int key) {
        Node cur = this.head;
        if (cur.data == key) {
            return this.head;
        }
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public void remove(int key) {
        Node cur = findKey(key);
        if (cur == this.head) {
            this.head = this.head.next;
        }
        if (cur != null) {
            cur.next = cur.next.next;
        }
    }

    @Override
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    @Override
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display1(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
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

    @Override
    public Node midNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    @Override
    public Node findReK(int k) {
        Node fast = this.head;
        Node slow = this.head;
        if (this.head == null) {
            throw new IndexOutOfBoundsException("链表为空！");
        }
        if (k < 0) {
            throw new IndexOutOfBoundsException("输入下标越界！");
        }
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                throw new IndexOutOfBoundsException("输入下标越界！");
            }
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    @Override
    public Node mergeList(Node headA, Node headB) {
        Node node = new Node(-1);
        Node tmp = node;
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
                tmp.next = headB;
                return node.next;
            }
            if (headB == null) {
                tmp.next = headA;
                return node.next;
            }
        }
    }

    @Override
    public Node baseX(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = null;
            if (cur.data < x) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = curNext;
        }
        if (bs == null) {
            return as;
        } else {
            be.next = as;
            return bs;
        }
    }

    @Override
    public Node deleteDuplication() {
        Node node = new Node(-1);
        Node tmp = node;
        Node cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;//重点
        return node.next;
    }

    @Override
    public boolean palindromeList() {
        Node cur = this.head;
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node p = slow.next;
        while (p != null) {
            Node pNext = p.next;
            p.next = slow;
           slow = p;
           p = pNext;
        }

        while (cur != null) {
            if (cur.data == fast.data) {
                cur = cur.next;
                fast = fast.next;
            }
            if (cur.next == fast) {
                return true;
            }
            if (cur == fast) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Node publicNode(Node headA, Node headB) {
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
            pL = pL.next;
            len--;
        }
        while (pL.data != pS.data) {
            pL = pL.next;
            pS = pS.next;
            if (pL == null) {
                return null;
            }
        }
        return pL;
    }

    @Override
    public boolean cycleList(Node head) {
        if (head == null) {
            return false;
        }
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

    @Override
    public Node detectCycle(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    @Override
    public ListNode copyRandomList(ListNode head) {
        if (head == null) {
         return  null;
        }
        ListNode cur = head;
        while (cur != null) {
            ListNode node = new ListNode(cur.data,cur.next,null);
            cur.next = node;
            cur = node.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            } else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        cur = head;
        ListNode newHead = cur.next;
        while (cur.next != null) {
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }

}


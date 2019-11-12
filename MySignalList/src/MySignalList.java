
public class MySignalList {

    private Node head;

    private class Node {
        private int date;
        private Node next;

        private Node(int date) {
            this.date = date;
            this.next = null;
        }
    }
    MySignalList() {
        this.head = null;
    }
    //判断链表是否为空
    private boolean isEmpty() {
        return this.head == null;
    }
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //找到最后一个节点
    private Node lastNode() {
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    //尾插法    
    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            this.head = node;
        } else {
            Node cur = lastNode();
            cur.next = node;
        }
    }
    //查找是否包含关键字key是否在单链表当中    
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
    //得到单链表的长度    
    public int size() {
        Node node = this.head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }
    //找到index-1 的节点
    private Node searchIndex(int index) {
        Node cur = this.head;
        for (int i = 0; i <index - 1 ; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标    
    public void addIndex(int index,int data) {
        if (index < 0 ||index > size()) {
            throw new IndexOutOfBoundsException("输入不合法！");
        }
        Node node = new Node(data);
        if (index == 0) {
            addFirst(data);
        }else {
            Node cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
    }
    //找到关键字key的前驱
    private Node searchKeyPre(int key) {
        if (!contains(key)) {
            return null;
        }else {
            Node cur = this.head;
            while (cur.next.date != key) {
                cur = cur.next;
            }
            return cur;
        }
    }
    //删除关键字为key的节点
    public void removeKey(int key) {
        if (this.head == null) {
            System.out.println("单链表为空！");
            return;
        }
        if (this.head.date == key) {
            this.head = this.head.next;
            return;
        }
        Node pre = searchKeyPre(key);
        if (pre == null) {
            return;
        }
        Node del = pre.next;
        pre.next = del.next;

    }
    //删除所有关键字为key的节点
    public void removeAllKey(int key) {
        Node pre = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (pre.next.date == key) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (this.head.date == key) {
            this.head = this.head.next;
        }
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.date + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    /* }
     //反转单链表  1，头插法
     public Node reverseList1() {
         Node cur = this.head;
         Node newHead = null;
         Node curNext = cur.next;
         cur.next = null;
         while (curNext != null) {
             curNext.next = cur;
             cur = curNext;
             curNext = cur.next;
         }
         return newHead;
     }*/
    //2，定义4个引用
    // pre  cur curNext newHead
    public Node reverseList() {
        Node cur = this.head;
        Node pre = null;
        Node newHead = null;
        //当前节点不为空 一直循环
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
    public void display1() {
        Node cur1 = findKthToTail(5);
        while (cur1 != null) {
            System.out.print(cur1.date +" ");
            cur1 = cur1.next;
        }
        System.out.println();
    }
    //返回中间节点
    public Node midNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点
    //1，fast 走k - 1步
    public Node findKthToTail(int k) {
        if (k <= 0) {
            System.out.println("输入不合法！");
        }
        Node fast = this.head;
        Node slow = this.head;
        while (k-1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //6. 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node cutKey(int k) {
        Node cur = this.head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = null;
            if (cur.date < k) {
                //第一次
                if (bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = curNext;
        }
        if (bs != null) {
            be.next = as;
            return bs;
        }else {
            return as;
        }
    }
    //7. 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public Node deleteDuplication() {
        Node node = new Node(-1);
        Node cur = this.head;
        Node tmp = node;
        while (cur != null) {
            if(cur.next != null &&
                    cur.date == cur.next.date) {
                //1、循环
                while (cur.next != null &&cur.date == cur.next.date) {
                    cur = cur.next;
                }
                //2、退出循环 cur要多走一步
                cur = cur.next;
            }else {
                //当前节点 不等于下一个节点的时候
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        return node.next;
    }
    //链表的回文结构
    public boolean palinadrome() {
        Node fast = this.head;
        Node slow = this.head;
        //找中间
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转单链表后半部分
        Node p = slow.next;
        while (p != null) {
            Node pNext = p.next;
            p.next = slow;
            slow = p;
            p = pNext;
        }
        //判断是否回文
        while (this.head.date == slow.date) {
            this.head = this.head.next;
            slow = slow.next;
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
    //创建环

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
       while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
           if (fast == slow) {
               return true;
           }
       }
       return false;
    }
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null

    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = this.head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
public Node mergeTowList(Node headA,Node headB) {
        Node node = new Node(-1);
        Node tmp = node;
        while (headA != null && headB != null) {
            if (headA.date < headB.date) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
            if (headA != null) {
                tmp.next = headA;
            }
            if (headB != null) {
                tmp.next = headB;
            }
        }
        return node.next;
}
// 输入两个链表，找出它们的第一个公共结点
public Node  getIntersectionNode(Node headA,Node headB) {
    if (headA == null || headB == null) {
        return null;
    }
    //永远指向最长的单链表
    Node pL = headA;
    //永远指向最短的单链表
    Node pS = headB;

    int lenA = 0;
    int lenB = 0;

    //分别求长度
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
    //求长度的差值
    int len = lenA - lenB;
    //如果是负数-》pL = headB;  pS = headA
    if (len < 0) {
        len = -len;
        pL = headB;
        pS = headA;
    }
    //只需要让pL走len步就好了
    while (len > 0) {
        pL = pL.next;
        len--;
    }
    //走完len步之后  两个同时开始走
    while (pL != pS) {
        pL = pL.next;
        pS = pS.next;
        if (pL == null || pS == null) {
            return null;
        }
    }
    return pL;
}
public void creatCut(Node head,Node head1) {
        head.next = head1.next.next;
}
}

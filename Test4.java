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
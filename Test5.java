 // 给定一个链表，返回链表开始入环的第一个节点。?如果链表无环，则返回?null
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
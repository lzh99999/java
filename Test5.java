 // ����һ��������������ʼ�뻷�ĵ�һ���ڵ㡣?��������޻����򷵻�?null
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
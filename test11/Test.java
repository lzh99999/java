public Node reverseList() {
        Node cur = this.head;
        Node pre = null;
        Node newHead = null;
        //��ǰ�ڵ㲻Ϊ�� һֱѭ��
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
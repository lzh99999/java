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
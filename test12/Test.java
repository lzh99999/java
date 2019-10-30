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
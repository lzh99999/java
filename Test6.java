public void clear() {
        if (this.last != null) {
        while (this.head != this.last) {
        ListNode cur = this.last;
        this.last = cur.prev;
        this.last.next = null;
        cur.prev = null;
        }
        this.head = null;
        this.last = null;
        }
        }

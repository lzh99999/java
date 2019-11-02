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
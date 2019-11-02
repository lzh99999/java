public Node  getIntersectionNode(Node headA,Node headB) {
    if (headA == null || headB == null) {
        return null;
    }
    //��Զָ����ĵ�����
    Node pL = headA;
    //��Զָ����̵ĵ�����
    Node pS = headB;

    int lenA = 0;
    int lenB = 0;

    //�ֱ��󳤶�
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
    //�󳤶ȵĲ�ֵ
    int len = lenA - lenB;
    //����Ǹ���-��pL = headB;  pS = headA
    if (len < 0) {
        len = -len;
        pL = headB;
        pS = headA;
    }
    //ֻ��Ҫ��pL��len���ͺ���
    while (len > 0) {
        pL = pL.next;
        len--;
    }
    //����len��֮��  ����ͬʱ��ʼ��
    while (pL != pS) {
        pL = pL.next;
        pS = pS.next;
        if (pL == null || pS == null) {
            return null;
        }
    }
    return pL;
}
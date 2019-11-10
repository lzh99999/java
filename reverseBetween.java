/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        // �ҵ���ת�����ֵ�ǰһ���ڵ�, 1->2->3->4->5->NULL, m = 2, n = 4 ָ���� �ڵ�ֵΪ1
        for (int i = 0; i < m - 1; i++) pre = pre.next;
        // ��˫ָ��,��������ת
        ListNode node = null;
        ListNode cur = pre.next;
        for (int i = 0; i < n - m + 1; i++) {
            ListNode tmp = cur.next;
            cur.next = node;
            node = cur;
            cur = tmp;
        }
        // ����ת���� �� ԭ����ƴ��
        pre.next.next = cur;
        pre.next = node;
        return dummy.next;
    }
}
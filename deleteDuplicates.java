/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode node = new ListNode(-1);
        ListNode cur = head;
        ListNode tmp = node;
        while (cur != null) {
            if(cur.next != null &&
                    cur.val == cur.next.val) {
                //1��ѭ��
                while (cur.next != null &&cur.val == cur.next.val) {
                    cur = cur.next;
                }
                //2���˳�ѭ�� curҪ����һ��
                cur = cur.next;
            }else {
                //��ǰ�ڵ� ��������һ���ڵ��ʱ��
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next = null;
        return node.next;
    }
}
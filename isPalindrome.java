/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public boolean isPalindrome(ListNode head) {
        // �߽��������������ֻ��һ���ڵ������
        if (head == null || head.next == null) {
            return true;
        }

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        // ��ָ��һ����һ������ָ��һ��������������ָ���ߵ��յ㣬��ָ��պô����е�λ��
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // fastָ�������°����������
        fast = slow.next;
        // �Ͽ�ǰ����������
        slow.next = null;
        // slowָ������ǰ�����������
        slow = dummyNode.next;

        // ��ת��������
        ListNode pre = null; // ����ָ��ǰһ�ڵ����Ϣ�����ڷ�ת
        while (fast != null) {
            ListNode nextTemp = fast.next;
            fast.next = pre;
            pre = fast;
            fast = nextTemp;
        }

        // ǰ���������һ�Ƚϣ���������Ϊ����ʱǰ��������ȱȺ��ζ�1�������Ժ���Ϊ׼
        while (pre != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
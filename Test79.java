//����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead == null) {
            return null;
        }
        RandomListNode cur = pHead;
        while(cur != null) {
            RandomListNode node = new RandomListNode(cur.label);
            node.next = cur.next;
            cur.next = node;
            cur = node.next;
        }
        cur = pHead;
        while(cur != null) {
            if(cur.random != null) {
                cur.next.random = cur.random.next;
            }else {
                cur.next.random = null;
            }
            cur = cur.next.next;
        }
        cur = pHead;
        RandomListNode newHead =  cur.next;
        while(cur.next != null) {
            RandomListNode tmp = cur.next;;
            cur.next = tmp.next;
            cur = tmp;
        }
        return newHead;
    }
}
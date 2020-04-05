package test;

import java.util.ArrayList;

class Solution {
    public static int StrToInt(String str) {
        if(str == null || str.length() == 0||str.length() >11) {
            return 0;
        }
        boolean flag = false;
        boolean flag1 = false;
        int sum = 0;

        for(int i = 0; i < str.length();i++) {
            char ch = str.charAt(i);
            if(ch == '+') {
                if(!flag){
                    flag = true;
                    continue;
                }else {
                    return 0;
                }
            }
            if(ch == '-') {
                if(!flag){
                    flag = true;
                    flag1 = true;
                    continue;
                }else {
                    return 0;
                }
            }
            if(Character.isDigit(ch)) {
                if((i==str.length()-1)&&Character.digit(ch,10)>7 && !flag1) {
                    return 0;
                }
                if((i==str.length()-1)&&Character.digit(ch,10)>8 && flag1) {
                    return 0;
                }
                sum = sum * 10 +Character.digit(ch,10);
            }else {
                return 0;
            }
        }
        if(flag1) {
            return -sum;
        }
        return sum;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
        public TreeLinkNode GetNext(TreeLinkNode pNode){
            //有右节点  找右节点的最左边的节点
            if(pNode.right != null) {
                TreeLinkNode cur = pNode.right;
                while(cur.left != null) {
                    cur = cur.left;
                }
                return cur;
            }
            //如果没有右节点  看看该节点是不是 父节点的左节点
            if(pNode.next!=null && pNode.next.left == pNode) {
                return pNode.next;
            }
            //如果没有右节点  还不是父节点的左节点
            if(pNode.next!=null){
                while(pNode.next != null && pNode.next.right== pNode) {
                    pNode = pNode.next;
                }
                return pNode.next;
            }
            return null;
        }
    public static int sum(int n){
        int sum = 0;
        if(n==0) return sum;
        while(n != 0) {
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1232));
    }
}
 class Solution1 {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        if(num == null || size <=0) {
            return null;
        }
        int length = num.length;
        int end = length-size;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<=end;i++) {
            int max = num[i];
            int tmp = size-1;
            int j = i+1;
            while(tmp>0) {
                if(max<num[j]) {
                    max = num[j];
                }
                j++;
                tmp--;
            }
            list.add(max);
        }
        return list;
    }
}
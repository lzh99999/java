//����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null||sequence.length==0) {
                return false;
        }
            return fun(sequence,0,sequence.length-1);
    }
    public boolean fun(int [] sequence,int start,int root) {
        if(start>=root) {
                return true;
        }
            int i;
            for( i = start;i<root;i++) {
                    if(sequence[i] > sequence[root]) {
                            break;
                    }
            }
            for(int j = i;j < root;j++) {
                    if(sequence[j] < sequence[root]) {
                            return false;
                    }
            }
            return fun(sequence,0,i-1)&&fun(sequence,i,root-1);
    }
}
import java.util.*;
public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        if(A == null || n < 1) {
            return -1;
        }
        int left = 0;
        int right = n-1;
        while(left < right) {
            int mid = (left + right)/2;
            if(A[mid] == val) {
               right = mid;
            }else if(A[mid] < val) {
                left = mid+1;
            }else{
                right = mid;
            }
        }
       if(A[left] == val) return left;//���left==right ��ʱ�� �����ж�һ��
        return -1;
    }
}
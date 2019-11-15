import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        if(gifts == null || n < 1) {
            return 0;
        } 
        int size = n/2;
        int[] arr = new int[100000];
        for(int i = 0;i < n;i++) {
            arr[gifts[i]]++;
            if(arr[gifts[i]] > size) {
                return gifts[i];
            }
        }
        return 0;
    }
}
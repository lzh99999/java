package insertSort;
import java.util.Arrays;
//直接插入排序
public class InsertSort {
    public static void main(String[] args) {
        int [] a={2,3,1,4,3,4};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int key = arr[i];
            int j;
            for ( j=i-1;j>=0;j--)
            {
               if(key>=arr[j])
               {
                   break;
               }
               else{
                   arr[j+1]=arr[j];
               }
            }
            arr[j+1]=key;
        }
    }

}
















import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int count = 0;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            sb = new StringBuilder();
            count = 0;
            int n = sc.nextInt();
            boolean[] flag = new boolean[n];
            int sum = sc.nextInt();
            int[] array = new int[n];
            for(int i = 0;i < n;i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            fun(array,sum, flag);
            System.out.println(count);
        }
    }
    private static void fun(int[] array,int sum,boolean[] flag) {
        if(sum < 0) {
            return;
        }
        if(sum ==0){
                count++;
            return;
        }
        for(int i = 0;i < array.length; i++) {
            if(!flag[i]) {
                flag[i] = true;
                sum -=array[i];
                if (sb.toString().contains(""+i)){
                    continue;
                }
                sb.append(i);
                fun(array,sum,flag);
                sum += array[i];
                flag[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
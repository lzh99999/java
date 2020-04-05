package test;

import java.util.*;
 class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if(n == 0) {
                break;
            }
            int ret = fun(n);
            System.out.println(ret);
        }
    }
    private static int fun(int n) {
        if(n==0|| n==1) {
            return 0;
        }
        if(n==2) {
            return 1;
        }
        return (n/3)+fun(n/3+n%3);
    }
}
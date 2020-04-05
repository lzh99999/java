package test;

/**
 * 描述:
 */

import java.util.Scanner;

/*public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<String> stack = new Stack<>();
        for(int i = 0;i < n;i++) {
            String ch = A.charAt(i)+"";
            if(stack.empty()) {
                if(ch.equals(")")) {
                    return false;
                }else {
                    stack.push(ch);
                }
            }else {
                if(ch.equals("(")) {
                    stack.push(ch);
                }else {
                    String tmp = stack.peek();
                    if(tmp.equals(")")) {
                        return false;
                    }else {
                        stack.pop();
                    }
                }
            }
        }
        if(!stack.empty()) {
            return false;
        }else {

            return true;
        }
    }
}*/

public class Test01 {
    //
//
//        private static int n;
//        private static int[] arr = new int[n];
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            for(int i =0;i < n;i++) {
//                arr[i] = sc.nextInt();
//            }
//            System.out.println(fun(40,n));
//        }
//        private static int fun(int size,int n) {
//            if(size == 0) {
//                return 1;
//            }
//            if(size >0 && n <= 0) {
//                return 0;
//            }
//            return fun(size,n-1)+fun(size-arr[n-1],n-1);
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                String ch = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (ch.equals("Q")) {
                    if (b < a) {
                        int tmp = a;
                        a = b;
                        b = tmp;
                    }
                    int max = arr[a];
                    for (int i = a + 1; i <= b; i++) {
                        if (arr[i] > max) max = arr[i];
                    }
                    System.out.println(max);
                } else if (ch.equals("U")) {
                    arr[a] = b;
                }
            }
        }
    }
}
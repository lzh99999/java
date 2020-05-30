import java.util.Scanner;


public class Main1 {
    public static String[] chars = null;
    public static int[] array = null;
    public static int index = 0;
	//
    public static int count = 0;

    public static int AddCandidate(String pCandidateName) {
        for (int i = 0; i < chars.length; i++) {
            if (pCandidateName.equals(chars[i])) {
                return 0;
            }
        }
        chars[index++] = pCandidateName;
        return 1;
    }

    public static void Vote(String pCandidateName) {
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (pCandidateName.equals(chars[i])) {
                array[i]++;
                flag = true;
            }
        }
        if (!flag) {
            count++;
        }
    }

    public static int GetVoteResult(String pCandidateName) {
        for (int i = 0; i < chars.length; i++) {
            if (pCandidateName.equals(chars[i])) {
                return array[i];
            }
        }
        return count;
    }

    public static void Clear() {
        chars = null;
        array = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            chars = new String[n];
            array = new int[n];
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                AddCandidate(str);
            }
            int shu = sc.nextInt();
            for (int i = 0; i < shu; i++) {
                String str = sc.next();
                Vote(str);
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(chars[i] + ":" + array[i]);
            }
            System.out.println("invalid:" + count);
        }
    }
}
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int sum = fun(n);
            int ret = fun((int)Math.pow(n,2));
            System.out.println(sum+" "+ret);
        }
    }
    private static int fun(int n) {
        if(n==0) {
            return 0;
        }
        return fun(n/10) + n%10;
    }
}*/
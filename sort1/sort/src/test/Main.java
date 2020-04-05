package test;

/**
 * 描述:
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int sum =0;
        for(int i =0;i<= a.length();i++) {
            String tmp = a.substring(0,i)+b+a.substring(i);
            if(fun(tmp)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    private static boolean fun(String str) {
        int left =0;
        int right = str.length()-1;
        while(left < right) {
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}

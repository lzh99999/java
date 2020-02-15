import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 */
/*
class Solution {
    public static String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);
        int left = 0;
        int right = S.length()-1;
        char rich = S.charAt(right);
        char lfch = S.charAt(left);
        while (left<right) {
            while (!((lfch >='A' && lfch <= 'Z') || (lfch >='a' && lfch <= 'z'))) {
                left++;
                lfch = S.charAt(left);
            }
            while (!((rich >='A' && rich <= 'Z') || (rich >='a' && rich <= 'z'))) {
                right--;
                rich = S.charAt(right);
            }
            sb.setCharAt(right,lfch);
            sb.setCharAt(left,rich);
            left++;
            right--;
            lfch = S.charAt(left);
            rich = S.charAt(right);

        }
        return sb.toString();
    }
    public static boolean isLongPressedName(String name, String typed) {
        int len_n = name.length();
        int len_t = typed.length();
        if (len_n > len_t) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < len_n && j < len_t) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == len_n;
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = reverseOnlyLetters("asd-aqwr-dsfd-fr%ffd");
        System.out.println("s = " + s);
    }
}
class Test {
    private float f = 1f;
    int m =13;
    static int n =4;

    public static void main3(String[] args) {
        Test t = new Test();
        float f = t.f;
    }
}
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long f1 =1;
        long f2 = 1;
        long f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = (f1+f2)% 10007;
            f1 = f2%10007;
            f2 = f3%10007;
        }
        System.out.println(f3);
    }
    public static int lengthOfLastWord(String s) {
        String trim = s.trim();
        int last = trim.lastIndexOf(" ");
       if (last == -1) return trim.length();
        return trim.length()-last-1;
    }
    public  static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        int count = -1;
        for (int i = 0; i < ransomNote.length(); i++) {
            count = sb.indexOf(ransomNote.charAt(i)+"");
            if (count>=0) {
                sb.deleteCharAt(count);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main2(String[] args) {
        int ass_asd_assd = lengthOfLastWord("a ");
        System.out.println("ass_asd_assd = " + ass_asd_assd);
        // System.out.println(canConstruct("asb","aab"));
    }
    public static void main1(String[] args) {

        int i =7;
        do {
            System.out.println(--i);
            --i;
        }while (i !=0);
        System.out.println(i);
    }
}

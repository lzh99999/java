import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        long shu = sc.nextLong();
        int[] arr = new int[4];
        String s1 = Long.toBinaryString(shu);
        String[] ips = ip.split("\\.");
        long sum = 0;
        int ex = 24;//167969729
        for (int i = 0; i < 4; i++) {
            long tmp = Integer.parseInt(ips[i]);
            String s = Long.toBinaryString(tmp);
            int ret = ex;
            for (int j = s.length() - 1; j >= 0; j--) {
                int ch = s.charAt(j) - '0';
                sum += ch * Math.pow(2, ret++);
            }
            ex -= 8;
        }
        System.out.println(sum);
        int index = 0;
        int x = 3;
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--) {
            int ch = s1.charAt(i) - '0';
            if (index == 8) {
                sb.reverse();
                ips[x--] = sb.toString();
                index = 0;
                sb = new StringBuilder();
            }
            sb.append(ch);
            index++;//167969729
        }
        if(x==0) {
            while (sb.length() != 8) {
                sb.append(0);
            }
            sb.reverse();
            ips[x] = sb.toString();
        }
        int c = 0;
        for (int i = 0; i < ips.length; i++) {
            int a = 0;
            int index1 = 0;
            for (int j = ips[i].length() - 1; j >= 0; j--) {
                int ch = ips[i].charAt(j) - '0';
                a += ch * Math.pow(2, index1);
                index1++;
            }
            arr[c++] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ".");
            }
        }
    }
}

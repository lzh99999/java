
/**
 * 描述:有n（2≤n≤20）块芯片，有好有坏，已知好芯片比坏芯片多。
 * 　　每个芯片都能用来测试其他芯片。用好芯片测试其他芯片时，
 * 能正确给出被测试芯片是好还是坏。而用坏芯片测试其他芯片时，
 * 会随机给出好或是坏的测试结果（即此结果与被测试芯片实际的好坏无关）。
 * 　　给出所有芯片的测试结果，问哪些芯片是好芯片。
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count>max) {
                max = count;
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[index][i] ==1) {
                System.out.print((i+1)+" ");
            }
        }
    }
}

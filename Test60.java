/*

���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�

00000

00001

00010

00011

00100

�밴��С�����˳�������32��01����*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=1; j++) {
                for (int k = 0; k <=1; k++) {
                    for (int l = 0; l <=1; l++) {
                        for (int m = 0; m <=1; m++) {
                            System.out.println(i+""+j+""+k+""+l+""+m);
                        }
                    }
                }
            }
        }
    }
}

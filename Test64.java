import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ����:Huffman���ڱ��������Ź㷺��Ӧ�á����������ֻ����Huffman���Ĺ�����̡�
 * ��������һ����{pi}={p0, p1, ��, pn-1}��������������Huffman���Ĺ������£�
 * ����1. �ҵ�{pi}����С������������Ϊpa��pb����pa��pb��{pi}��ɾ������Ȼ�����ǵĺͼ��뵽{pi}�С�������̵ķ��ü�Ϊpa + pb��
 * ����2. �ظ�����1��ֱ��{pi}��ֻʣ��һ������
 * ����������Ĳ��������У������еķ�����ӣ��͵õ��˹���Huffman�����ܷ��á�
 * �����������񣺶��ڸ�����һ�����У�������������ø����й���Huffman�����ܷ��á�
 * �����ʽ
 * ��������ĵ�һ�а���һ��������n��n<=100����
 * ������������n������������ʾp0, p1, ��, pn-1��ÿ����������1000��
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        while (list.size() > 1) {
            Collections.sort(list);
            int a = list.get(0);
            ((LinkedList<Integer>) list).removeFirst();
            int b = list.get(0);
            ((LinkedList<Integer>) list).removeFirst();
            int c = a + b;
            list.add(c);
            sum += c;
        }
        System.out.println(sum);
    }
}

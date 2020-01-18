import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 描述:Huffman树在编码中有着广泛的应用。在这里，我们只关心Huffman树的构造过程。
 * 　　给出一列数{pi}={p0, p1, …, pn-1}，用这列数构造Huffman树的过程如下：
 * 　　1. 找到{pi}中最小的两个数，设为pa和pb，将pa和pb从{pi}中删除掉，然后将它们的和加入到{pi}中。这个过程的费用记为pa + pb。
 * 　　2. 重复步骤1，直到{pi}中只剩下一个数。
 * 　　在上面的操作过程中，把所有的费用相加，就得到了构造Huffman树的总费用。
 * 　　本题任务：对于给定的一个数列，现在请你求出用该数列构造Huffman树的总费用。
 * 输入格式
 * 　　输入的第一行包含一个正整数n（n<=100）。
 * 　　接下来是n个正整数，表示p0, p1, …, pn-1，每个数不超过1000。
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

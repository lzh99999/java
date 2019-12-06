
public class Test {
    private static int test(char[] a) {
        int left = 0;
        int size = 0;
        for (int right = 0; right <= a.length; right++) {
            if (right == a.length || a[left] != a[right]) {
                a[size++] = a[left];
                if (right - left > 1) {
                    for (char c: String.valueOf(right-left).toCharArray()) {
                        a[size++] = c;
                    }
                }
                left = right;
            }
        }
        return size;
    }
    public static void main(String[] args) {
        char[] a = new char[] {'1','1','2','2','2','3','3'};
        System.out.println(test(a));
    }
}

public class Main {
    private static int fun(int x, int y) {
        if (x <= 0 || y <= 0) return 1;
        return 3 * fun(x - 6, y / 2);
    }

    public static void main(String[] args) {
        System.out.println(fun(20,13));
    }
}
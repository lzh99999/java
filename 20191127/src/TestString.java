public class TestString {
    public static void main(String[] args) {
       String str = "1234567890";
        System.out.println(isString(str));
        String str1 = "123456a7890";
        System.out.println(isString(str1));
    }
    private static boolean isString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)<'0'||str.charAt(i)>'9') {
                return false;
            }
        }
        return true;
    }
}

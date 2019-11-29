public class TestString {
    public static void main(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        char[] array = {'a','b','c','d','e','f'};
        String str3 = new String(array);
        String str4 = "abc"+"def";//编译期已经确定-》"abcdef"
        String str5 = "abc"+new String("def");
        System.out.println(str == str2);//false
        System.out.println(str == str3);
        System.out.println(str == str4);
        System.out.println(str == str5);
        String str6 = "abc";
        String str7 = "def";
        String str8 = str6+str7;
        System.out.println(str == str8);
        /*String str = "abcdef";//直接赋值
        System.out.println(str);
        String str2 = new String("abcdef");
        System.out.println(str2);
        char[] array = {'a','b','c','d','e','f'};
        String str3 = new String(array);
        System.out.println(str3);
        System.out.println(str == str2);
        System.out.println(str == str3);*/
 /*String str = "abcdef";//直接赋值
        String str2 = new String("abcdef").intern();
        System.out.println(str == str2);*/

        /*String str2 = new String("abcdef").intern();
        String str = "abcdef";
        System.out.println(str == str2);*/
    }
}

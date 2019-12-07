public class Main {
    private static int test(char[] chars) {
        int left=0;
        int size = 0;
        for (int right = 0; right <= chars.length; right++) {
            if (right==chars.length || chars[left] != chars[right]){
                chars[size++] = chars[left];
                if (right-left >1) {
                    for (char a:String.valueOf(right-left).toCharArray()) {
                        chars[size++] = a;
                    }
                }
                left = right;
            }
        }
        return size;
    }
    public static void main(String[] args) {
//        char[] a = new char[]{'1','1','1','2','2',3};
//        int s = test(a);
//        System.out.println(s);
        Mylist mylist = new Mylist();
        String a = mylist.change("student am i");
        System.out.println(a);
    }
}

public class Constructor {
    public Constructor() {
        System.out.println("无参数的构造函数");
    }
    public Constructor(int a) {
        System.out.println("有一个参数的构造函数"+ a);
    }
    public Constructor(int a,int b) {
        System.out.println("有两个参数的构造函数"+ a+" " + b);
    }
    public Constructor(int a,int b,int c) {
        System.out.println("有三个参数的构造函数"+ a+" " + b +" " + c);
    }
}

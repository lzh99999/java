import java.lang.reflect.Modifier;

/**
 * 描述:反射类的字段
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获得字节码文件
//        Class claxx = MyTest.class;
        Class claxx = Class.forName("MyTest");
        //返回修饰符
        int modifiers = claxx.getModifiers();//返回是一个整型
        System.out.println(Modifier.toString(modifiers));//通过toString静态方法可以转化为字符串
    }
}

final class MyTest {
    public int x = 0;
    private int y = 0;
    static int s = 0;

    public MyTest() {
        System.out.println("无参构造！");
    }
static {
    System.out.println("静态代码块！");
}
    public MyTest(int x, int y) {
        System.out.println("有参构造！");
        this.x = x;
        this.y = y;
    }
}

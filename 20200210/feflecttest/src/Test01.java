/**
 * 描述:获得字节码文件的3种方法
 * 1，每个类都有属性 class
 * 2，每个对象都有getClass（）方法（从object类继承来的）
 * 3，Class.forName(完整类名)
 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class claxx1 = String.class;//调用属性class
        Class claxx2 = "string".getClass();//对象调用getClass（）方法
        Class claxx3 = Class.forName("java.lang.String");//参数为完整类名
        /*
              调用Class.forName(完整类名) 会调用静态代码块，java的jdbc加载驱动就是这种方法
              对象调用getClass（）方法肯定会调用静态代码块
              注意：
                   类名.class  调用属性不会调用类静态代码块
         */

        //基本类型也有字节码文件
        Class claxx4 = int.class;
        Class claxx5 = Integer.TYPE;
        System.out.println(claxx4 == claxx5);//true
    }
}

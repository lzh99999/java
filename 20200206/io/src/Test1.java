import java.io.FileInputStream;
import java.io.IOException;

/**
 * 描述:熟悉使用字节流 FileInputStream
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //先创建FileInputStream对象
        FileInputStream fis = new FileInputStream("C:\\javatest\\io.txt");
        //文件中信息为：abcdef
        System.out.println(fis.available());//文件中的字节数 6
        System.out.println(fis.read());//从文件中获得第一个字节 返回值是int类型

        long skip = fis.skip(2);
        System.out.println(skip);
        System.out.println(fis.available());
        fis.close();
    }
}

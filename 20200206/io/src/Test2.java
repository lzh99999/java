import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 描述:FileInputStream类中的读取到byte数组中
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //先创建FileInputStream对象
        FileInputStream fis = new FileInputStream("C:\\javatest\\io.txt");
        byte[] bytes = new byte[4];
        int len = fis.read(bytes);//返回读取字节数的个数
        while (len != -1) {
            System.out.println(Arrays.toString(bytes) +"读取个数为："+len);
            len = fis.read(bytes);
        }
        fis.close();
    }
}

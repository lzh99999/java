import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:练习使用FileOutputStream类的写入文件和在文件结尾进行追加
 */
public class Test3 {
    public static void main(String[] args) {
        //创建FileOutputStream对象,如果文件不存在，系统会帮我们自动创建文件，如果文件存在，写入数据时会覆盖掉原来的数据
        //如果不想覆盖原来的数据，就在构造方法中加一个参数，true，就可以在文件的最后追加。
        try (FileOutputStream fos = new FileOutputStream("C:\\javatest\\io.txt",true)) {
            fos.write('a');
            fos.write('\r');
            fos.write('\n');
            byte[] bytes = new byte[] {'s','d','f'};
            fos.write(bytes);
            fos.write('\r');
            fos.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

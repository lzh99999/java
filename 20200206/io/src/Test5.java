import java.io.*;

/**
 * 描述:转换流的使用
 * InputStreamReader  学会使用InputStreamReader类
 * 该类可以读取文件的内容可以指定编码格式读取
 * OutputStreamWriter 类
 * 该类可以写入文件指定编码格式
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        //先创建字节流
        FileInputStream fis = new FileInputStream("C:\\javatest\\Test5.text");
        //然后将字节流转化为字符流  用字符流输入
        InputStreamReader isr = new InputStreamReader(fis,"UTF8" );
        int cc = isr.read();
        while (cc != -1) {
            System.out.print((char) cc);
            cc = isr.read();
        }
        isr.close();
        fis.close();
    }
}

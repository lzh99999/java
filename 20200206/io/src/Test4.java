import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:文件的复制
 * 1，一次读取一个字节然后写入
 * 2，一次读取一个字节数组然后写入
 */
public class Test4 {
    public static void main(String[] args) {
        String yuan = "C:\\idea_git\\java\\20200206\\io\\src\\Test4.java";
        String dest = "C:\\javatest\\Test5.text";
        fileCopy(yuan, dest);
    }

    private static void fileCopy(String yuan, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(yuan);
            fos = new FileOutputStream(dest);
            byte[] bytes = new byte[1024 * 8];
            int len = fis.read(bytes);
            while (len != -1) {
                fos.write(bytes);
                len = fis.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void fileCopy1(String yuan, String dest) {
        //先创建FileInputStream对象
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(yuan);
            fos = new FileOutputStream(dest);

            int cc = fis.read();
            while (cc != -1) {
                fos.write(cc);
                cc = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

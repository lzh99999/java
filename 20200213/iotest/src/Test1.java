import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:文件夹的复制
 */
public class Test1 {
    public static void main(String[] args) {
        String yuan = "";
        String dest = "";
        copyFile(yuan,dest);
    }

    private static void copyFile(String yuan, String dest) {
        File file = new File(yuan);
        File[] files = file.listFiles();
        for (File f : files) {
            File destFile = new File(dest);
            if (f.isFile()) {
                copyof(destFile,f);
            }else {
                destFile.mkdirs();
                copyFile(f.getAbsolutePath(),destFile.getAbsolutePath());
            }
        }
    }

    private static void copyof(File destFile, File f) {
        try (FileInputStream fis = new FileInputStream(f);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            byte[] bytes = new byte[1024];
            int len = fis.read(bytes);
            while (len != -1) {
                fos.write(bytes);
                len = fis.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

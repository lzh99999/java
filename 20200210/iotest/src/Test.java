import java.io.*;

/**
 * 描述:文件夹的复制
 */
public class Test {
    public static void main(String[] args) {
        String yuan ="";
        String dest ="";
        copyFile(yuan,dest);
    }

    //文件夹的复制
    private static void copyFile(String yuan, String dest) {
        File yuanFile = new File(yuan);
        File[] f = yuanFile.listFiles();
        for (File file : f) {
            File destFile = new File(dest);
            if (file.isFile()) {
                copyOfFile(destFile,file);
            }else {
                destFile.mkdirs();
                copyFile(file.getAbsolutePath(),destFile.getAbsolutePath());
            }
        }
    }
//把file中的文件复制到destFile文件中
    private static void copyOfFile(File destFile, File file) {
        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            byte[] bytes = new byte[1024];
            int len = fis.read(bytes);
            while (len != -1) {
                fos.write(bytes);
                len = fis.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

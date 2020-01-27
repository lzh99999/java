import java.io.*;

/**
 * 描述:文件夹的复制
 */
public class FileCopy {
    public static void main(String[] args) {
        String yuan = "C:\\javatest";
        String dest = "C:\\mayun";
        fileCopy(yuan, dest);
    }

    //文件夹的复制
    private static void fileCopy(String yuan, String dest) {
        //先创建原文件
        File file = new File(yuan);
        File[] files = file.listFiles();
        for (File f : files) {
            //创建目标文件
            File destFile = new File(dest,f.getName());
            if (f.isFile()) {
                fliecopyof(destFile,f);//文件的复制
            }else {
                destFile.mkdirs();//创建文件夹
                fileCopy(f.getAbsolutePath(),destFile.getAbsolutePath());//递归调用
            }
        }
    }

    //复制文件
    private static void fliecopyof(File filedest, File f) {
        try (FileInputStream fis = new FileInputStream(f);
             FileOutputStream fos = new FileOutputStream(filedest)
        ) {
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

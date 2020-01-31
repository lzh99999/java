package io1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:实现文件夹的复制
 */
public class Test1 {
    public static void main(String[] args) {
        String yuan = "";
        String dest = "";
        copyFile(yuan,dest);
    }

    private static void copyFile(String yuan, String dest) {
        File yuanFile = new File(yuan);
        File[] files = yuanFile.listFiles();
        for (File file : files) {
            File destFile = new File(dest);
            if (file.isFile()) {
                copyOfFile(destFile,file);
            }else {
                destFile.mkdirs();
                copyFile(file.getAbsolutePath(),destFile.getAbsolutePath());
            }
        }
    }

    private static void copyOfFile(File destFile, File file) {
        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos = new FileOutputStream(destFile)
        ) {
            byte[] bytes = new byte[1024];
            int len = fis.read(bytes);
            if (len != -1) {
                fos.write(bytes);
                len = fis.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 描述:
 */

import java.io.*;

public class TestBufferStreamCopy {
    public static void main(String[] args) throws IOException {
        File file = new File("aaa.txt");
        if (!file.isFile()) {
            return;
        }
        BufferedInputStream bfis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bfos = new BufferedOutputStream(new FileOutputStream("src\\" + file.getName()));//copy到src目录下      
        byte bytes[] = new byte[1024];
        int temp = 0;
        //边读边写      
        while ((temp = bfis.read(bytes)) != -1) {//读          
            bfos.write(bytes, 0, temp);  //写      

        }
        bfos.flush();
        bfos.close();
        bfis.close();
        System.out.println("copy成功！");
    }
}
/**
 * 描述:
 */

import java.io.File;
import java.io.IOException;

public class FileDemo {
   
        public static void main (String[]args) throws IOException {
            String pathname = "C:\\my_java\\aaa.txt";
            File file = new File(pathname);
            if (file.exists()) { //文件存在，删除      
                file.delete();
                System.out.println("文件" + pathname + "存在，删除之");
            } else { //文件不存在，创建        
                try {
                    file.createNewFile(); //有创建失败的风险，需要捕捉异常      
                    System.out.println("文件" + pathname + "不存在，创建之");
                } catch (IOException e) { //文件部分异常，常见为IOException  
                    System.out.println("文件" + pathname + "创建失败");
                    e.printStackTrace();
                }
            }

        }

    }
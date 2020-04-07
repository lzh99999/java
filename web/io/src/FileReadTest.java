import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 描述:
 */
public class FileReadTest {
    @Test
    public void Test1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\idea_git\\java\\web\\io\\src\\FileReadTest.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
        /*String line ;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }*/
        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars, 0, 1024)) != -1) {
            String str = new String(chars, 0, len);
            System.out.println(str);
        }
    }

    @Test
    public void copy() throws IOException {
        String original = "C:\\idea_git\\java\\web\\io\\src\\FileReadTest.java";
        String dest = "C:\\idea_git\\java\\web\\io\\src\\FileReadTest.txt";
        FileInputStream fis = new FileInputStream(new File(original));
        FileOutputStream fos = new FileOutputStream(new File(dest));

        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
    }
}

class A {
    private static int a = 0;

    public static void main(String[] args) {
        A.a++;
    }
}
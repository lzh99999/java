import java.io.*;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\my_java\\aaa.txt");
        BufferedReader bReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter("C:\\my_java\\abc.txt");
        BufferedWriter bWriter = new BufferedWriter(writer);
        String content;     //readLine一行一行的读取
        while ((content = bReader.readLine()) != null) {
            //\r\n换行
            bWriter.write(content + "\r\n");
        }
        reader.close();
        bReader.close();
        bWriter.close();
        writer.close();
    }
}

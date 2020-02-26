package test06;

import java.io.*;
import java.net.Socket;

/**
 * 描述:多文件传输 用线程实现
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.6", 10000);
        BufferedReader br = new BufferedReader(new FileReader("udp\\tmp.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line1 = br1.readLine();
        System.out.println(line1);
        br.close();
        s.close();
    }
}

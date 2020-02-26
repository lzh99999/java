package test05;

import java.io.*;
import java.net.Socket;

/**
 * 描述:客户端读文件  服务器给出反馈
 * 服务器写入文件
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

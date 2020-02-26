package test05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 描述:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("udp\\server.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw1.write("服务器:文件上传成功！");
        bw1.newLine();
        bw1.flush();
        bw.close();
        ss.close();
    }
}

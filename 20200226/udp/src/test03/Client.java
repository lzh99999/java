package test03;

import java.io.*;
import java.net.Socket;

/**
 * 描述:数据来自键盘输入 直到输入123结束
 * 服务器写入文件中
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.6",10000);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("123".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();
    }
}

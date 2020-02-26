package test01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 描述:客户端给服务器发送信息  服务器反馈
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.6", 10000);
        byte[] bytes = "客户端给服务器发送的信息！".getBytes();
        OutputStream os = s.getOutputStream();
        os.write(bytes);

        InputStream is = s.getInputStream();
        int read = is.read(bytes);
        System.out.println(new String(bytes, 0, read));
        s.close();
    }
}

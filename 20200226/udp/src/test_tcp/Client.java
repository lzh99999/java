package test_tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/**
 * 描述:实现tcp的发送和接收
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s = new Socket("192.168.1.6",10000);
        //创建写入对象
        OutputStream os = s.getOutputStream();
        os.write("tcp客户端发送的数据".getBytes());
        s.close();
    }
}

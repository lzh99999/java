package test_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 描述:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建tcp接收对象
        ServerSocket ss = new ServerSocket(10000);
        //获得socket对象
        Socket s = ss.accept();
        //获得读数据对象
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes,0,len);
        System.out.println(str);
        ss.close();
    }
}

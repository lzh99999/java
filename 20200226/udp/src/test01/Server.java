package test01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 描述:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        byte[] bytes = new byte[1024];
        InputStream is = s.getInputStream();
        int r = is.read(bytes);

        System.out.println(new String(bytes, 0, r));


        OutputStream os = s.getOutputStream();
        os.write("服务器已经收到！".getBytes());

        ss.close();
    }
}

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 描述:tcp服务器
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        //反馈给客户端
        OutputStream os = s.getOutputStream();
        os.write("我已经收到".getBytes());
        ss.close();
    }
}

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 描述:
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s = new Socket("192.168.1.6", 10000);
        OutputStream os = s.getOutputStream();
        os.write("12312346".getBytes());

        //接收服务器的反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        String str = new String(bytes, 0, read);
        System.out.println(str);

        s.close();
    }
}

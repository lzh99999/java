import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 描述:
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s = new Socket("192.168.1.6", 10000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            if ("123".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();
            OutputStream os = s.getOutputStream();
            os.write(bytes);
        }
        s.close();
    }
}

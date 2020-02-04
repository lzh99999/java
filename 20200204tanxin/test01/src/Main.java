import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 描述:udp发送数据包
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //先创建发送端Socket
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!= null) {
            if ("886".equals(line)) {
                break;
            }
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.1.6"),10000);
            ds.send(dp);

        }
        ds.close();
    }
}

package test_udp;

import java.io.IOException;
import java.net.*;

/**
 * 描述:练习使用udp的客户端
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //先创建socket对象
        DatagramSocket  ds = new DatagramSocket();

        byte[] bytes = "udp客户端发送的数据".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,InetAddress.getByName("192.168.1.6"),10000);
        ds.send(dp);
        ds.close();
    }
}

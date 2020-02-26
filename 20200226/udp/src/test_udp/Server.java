package test_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * 描述:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //先创建接收对象
        DatagramSocket  ds = new DatagramSocket(10000);
        //创建接收的数组
        byte[] bytes = new byte[1024];
        //创建包
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //接收数据
        ds.receive(dp);
        //返回收到的数据数组
        byte[] data = dp.getData();
        //返回实际数组长度
        int length = dp.getLength();
        String str = new String(data,0,length);
        System.out.println(str);
    }
}

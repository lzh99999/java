package test06;

import java.io.*;
import java.net.Socket;

/**
 * 描述:
 */
public class ServerThread implements Runnable{
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int count =0;
            File f = new File("udp\\server["+count+"].txt");
            while (f.exists()) {
                count++;
                f = new File("udp\\server["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw1.write("服务器：文件上传成功！");
            bw1.newLine();
            bw1.flush();
            bw.close();
            s.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

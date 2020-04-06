package operation;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 描述:
 */
public class Time {
    public static void main(String[] args) {
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("1111");
            }
        };
        new Timer().schedule(tt,3000,1000);
    }
}

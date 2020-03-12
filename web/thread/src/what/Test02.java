package what;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述:
 */
public class Test02 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
    }
}
class Fun extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
    }
}
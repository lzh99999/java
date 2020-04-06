package model.multithreading_slacker_model;

/**
 * 描述:懒汉模式  多线程版 效率低
 */
public class Main {
    private static Main main = null;
    private Main() {}

    public synchronized static Main getMain() {
        if (main == null) {
            main = new Main();
        }
        return main;
    }
}

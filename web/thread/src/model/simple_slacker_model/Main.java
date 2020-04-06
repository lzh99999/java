package model.simple_slacker_model;

/**
 * 描述:懒汉模式  单线程版
 */
public class Main {
    private static Main main = null;
    private Main() {}

    public static Main getMain() {
        if (main == null) {
            main = new Main();
        }
        return main;
    }
}

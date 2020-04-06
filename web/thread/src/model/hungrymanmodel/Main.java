package model.hungrymanmodel;

/**
 * 描述:饿汉模式
 */
public class Main{
    private static Main main = new Main();
    private Main() {}

    public static Main getMain() {
        return main;
    }

}

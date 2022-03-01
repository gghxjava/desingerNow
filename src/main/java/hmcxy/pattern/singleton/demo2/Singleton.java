package hmcxy.pattern.singleton.demo2;

/**
 * 饿汉式：静态代码块
 */
public class Singleton {

    private Singleton(){};

    //申明Singleton静态变量
    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }

}

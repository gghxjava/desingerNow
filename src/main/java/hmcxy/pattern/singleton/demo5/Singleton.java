package hmcxy.pattern.singleton.demo5;

/**
 * 静态内部类,这个方法啊 ，比较好用，也是用的人比较多的一张方式
 */
public class Singleton {

    private Singleton(){}

    public static class SingletonHole{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHole.INSTANCE;
    }



}

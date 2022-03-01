package hmcxy.pattern.singleton.demo7;

public class Singleton {

    private Singleton(){}

    public static class SingletonHole{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHole.INSTANCE;
    }


}

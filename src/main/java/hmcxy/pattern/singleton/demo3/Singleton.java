package hmcxy.pattern.singleton.demo3;

/**
 * 懒汉式
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //申明Singleton类型的变量instance
    private static Singleton singleton; //这里只是申明一个变量，并没有赋值

    //对外提供访问方式
    public static synchronized Singleton getInstance(){
        if (singleton==null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

package hmcxy.pattern.singleton.demo4;

public class Singleton4 {

    private Singleton4(){}

    private static volatile Singleton4 singleton4;

    //对外提供公共访问的方式
    public static Singleton4 getInstance(){
        //第一次判断如果instance的值不为null,不需要抢占锁，直接返回对象
        if (singleton4 == null){
            synchronized (Singleton4.class){
                //第二次判断
                if (singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

}

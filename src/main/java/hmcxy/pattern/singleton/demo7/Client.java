package hmcxy.pattern.singleton.demo7;

/**
 * 反射和序列化会破坏单例模式，但是枚举本身就是单例的所有破坏不了
 */
public class Client {

    public static void main(String[] args) {



    }

    public static void writeObject2File(){
        //获取singleton对象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流
    }

}

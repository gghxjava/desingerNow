package hmcxy.pattern.singleton.demo1;

public class Client {

    public static void main(String[] args) {

        //创建Singleton对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //判断获取到的两个是否为同一个对象
        System.out.println(instance2==instance1);

    }

}

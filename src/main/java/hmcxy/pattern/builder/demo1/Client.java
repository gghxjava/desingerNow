package hmcxy.pattern.builder.demo1;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Client {

    public static void main(String[] args) {

        //创建指挥者对象
        Director director = new Director(new MobileBuilder());
        Bike construct = director.construct();
        System.out.println(construct);

    }

}

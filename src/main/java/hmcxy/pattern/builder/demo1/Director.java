package hmcxy.pattern.builder.demo1;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote  这里就是指挥者
 */
public class Director {

    //声明builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车的方法,这里就是控制顺序的地方
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        Bike bike = builder.createBike();
        return bike;
    }
}

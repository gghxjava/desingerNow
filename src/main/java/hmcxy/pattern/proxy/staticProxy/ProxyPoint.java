package hmcxy.pattern.proxy.staticProxy;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote 代售点类
 */
public class ProxyPoint implements SellTickets{

    //声明火车站对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一点服务费用");
        trainStation.sell();
    }
}

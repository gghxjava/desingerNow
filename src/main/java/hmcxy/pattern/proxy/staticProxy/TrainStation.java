package hmcxy.pattern.proxy.staticProxy;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote 火车站类
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}

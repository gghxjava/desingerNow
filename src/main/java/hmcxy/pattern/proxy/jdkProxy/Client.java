package hmcxy.pattern.proxy.jdkProxy;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Client {

    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();
        //使用工厂对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

    }

}

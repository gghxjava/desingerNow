package hmcxy.pattern.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote  获取代理对象的工厂类 代理类也实现了对应的接口
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        //返回代理对象既可
        /**
         * ClassLoader loader, 类加载器，用于加载类加载器，可以通过目标对象获取类加载器
         * Class<?>[] interfaces, 代理类实现的接口的字节码对象
         * InvocationHandler h 代理对象的调用处理程序
         */
        SellTickets sellTickets = (SellTickets)Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法被执行了");
                        System.out.println("代售点收取一定的服务费用jdk动态代理");
                        //执行目标对象的方法
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                }
        );
        return sellTickets;
    }

}

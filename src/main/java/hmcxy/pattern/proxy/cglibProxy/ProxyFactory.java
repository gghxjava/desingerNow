package hmcxy.pattern.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂，主要就是用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    //申明火车站对象
    private TrainStation t = new TrainStation();

    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //设置代理对象
        TrainStation proxy = (TrainStation)enhancer.create();
        return proxy;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib收取了一定的费用");
        //调用对象的方法
        Object invoke = method.invoke(t, objects);
        return invoke;
    }
}

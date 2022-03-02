package hmcxy.pattern.factory.configFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    //加载配置文件，获取配置文件中的全类名，并创建该类的对象进行存储
    //1. 定义容器对象来存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();

    //2. 加载配置文件，只需要加载一次
    static {
        Properties p = new Properties();
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(resourceAsStream);
            //从p集合中获取全类名并创建对象
            Set<Object> objects = p.keySet();
            for (Object object : objects) {
                String property = p.getProperty((String) object);
                Class aClass = Class.forName(property);
                Coffee coffee = (Coffee) aClass.newInstance();
                //将名称和对象存储到容器中
                map.put((String) object,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //根据名称获取对象
    public static Coffee createCoffee(String name){
        return map.get(name);
    }

}

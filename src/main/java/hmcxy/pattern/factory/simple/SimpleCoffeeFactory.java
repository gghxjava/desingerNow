package hmcxy.pattern.factory.simple;

/**
 * 简单工厂
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
           Coffee coffee = null;
           if ("a".equals(type)){
               coffee = new AmericanCoffee();
           }else if ("latte".equals(type)){
               coffee = new LatteCoffee();
           }else {
               throw new RuntimeException("对不起没有。您需要的咖啡");
           }
           return coffee;
    }

}

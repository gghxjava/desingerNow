package hmcxy.pattern.factory.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        //申明coffee类型的变量，根据不同类型创建不同的coffee
        Coffee coffee = null;
        if ("a".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}

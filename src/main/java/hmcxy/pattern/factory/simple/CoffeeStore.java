package hmcxy.pattern.factory.simple;

public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee a = simpleCoffeeFactory.createCoffee(type);
        return a;
    }

}

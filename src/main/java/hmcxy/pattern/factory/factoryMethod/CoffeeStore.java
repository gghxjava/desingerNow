package hmcxy.pattern.factory.factoryMethod;


public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        return coffee;
    }

}

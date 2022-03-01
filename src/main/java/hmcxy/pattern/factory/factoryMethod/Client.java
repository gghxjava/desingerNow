package hmcxy.pattern.factory.factoryMethod;

public class Client {

    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore(new LatteCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());

    }

}

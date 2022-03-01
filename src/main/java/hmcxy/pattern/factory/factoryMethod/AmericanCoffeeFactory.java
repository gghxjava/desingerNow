package hmcxy.pattern.factory.factoryMethod;

/**
 * 美式coffee对象
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}

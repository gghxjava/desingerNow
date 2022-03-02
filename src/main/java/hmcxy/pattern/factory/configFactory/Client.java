package hmcxy.pattern.factory.configFactory;

public class Client {

    public static void main(String[] args) {

        Coffee american1 = CoffeeFactory.createCoffee("american");
        Coffee american2 = CoffeeFactory.createCoffee("american");
        System.out.println(american1==american2);

    }

}

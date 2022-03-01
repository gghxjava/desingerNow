package hmcxy.pattern.factory.abstractFactory;

public class Client {

    public static void main(String[] args) {

        //意大利
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Dessert dessert = italyDessertFactory.createDessert();
        Coffee coffee = italyDessertFactory.createCoffee();
        dessert.show();
    }

}

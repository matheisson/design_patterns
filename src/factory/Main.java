package factory;

/**
 * Created by levente on 2017.05.31..
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore ny = new NYStylePizza();
        PizzaStore ch = new ChicagoStylePizza();

        ny.orderPizza("cheese");
        System.out.println();
        ch.orderPizza("veggIe");
    }
}

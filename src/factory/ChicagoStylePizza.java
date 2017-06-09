package factory;

import factory.impl.*;

/**
 * Created by levente on 2017.05.31..
 */
public class ChicagoStylePizza extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        type = type.toLowerCase();
        System.out.println("CHICAGO");
        if (type.equals("cheese")) {
            pizza = new ChicagoCheese();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggie();
        }
        return pizza;
    }
}

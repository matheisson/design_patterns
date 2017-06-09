package factory;

import factory.impl.CheesePizza;
import factory.impl.ClamPizza;
import factory.impl.PepperoniPizza;
import factory.impl.VeggiePizza;

/**
 * Created by levente on 2017.05.31..
 */
public class NYStylePizza extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("NEW YORK");
        type = type.toLowerCase();
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

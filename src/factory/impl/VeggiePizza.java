package factory.impl;

import factory.Pizza;

/**
 * Created by levente on 2017.05.31..
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza(){
        System.out.println("Veggie pizza ordered");
    }

    @Override
    public void prepare() {
        System.out.println("Throw on some veggies");
    }
}

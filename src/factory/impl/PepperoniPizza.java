package factory.impl;

import factory.Pizza;

/**
 * Created by levente on 2017.05.31..
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza(){
        System.out.println("Pepperoni pizza ordered");
    }


    @Override
    public void prepare() {
        System.out.println("Throw on some pepperoni");

    }
}

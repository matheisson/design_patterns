package factory.impl;

import factory.Pizza;

/**
 * Created by levente on 2017.05.31..
 */
public class ChicagoVeggie extends Pizza{

    public ChicagoVeggie(){
        System.out.println("Veggie pizza ordered");
    }

    @Override
    public void prepare() {
        System.out.println("Throw on some chicago veggei");

    }
}

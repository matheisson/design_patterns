package factory.impl;

import factory.Pizza;

/**
 * Created by levente on 2017.05.31..
 */
public class ChicagoCheese extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Chicago Pizza w cheese");
    }
}

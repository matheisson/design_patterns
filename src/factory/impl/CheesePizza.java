package factory.impl;

import factory.Pizza;

/**
 * Created by levente on 2017.05.31..
 */
public class CheesePizza extends Pizza {

    public CheesePizza(){
        System.out.println("Cheesee pizza ordered");
    }

    @Override
    public void prepare() {

    }

}

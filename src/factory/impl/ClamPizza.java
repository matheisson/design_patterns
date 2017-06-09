package factory.impl;

import factory.Pizza;

/**
 * Created by levente on 2017.05.31..
 */
public class ClamPizza extends Pizza {

    public ClamPizza(){
        System.out.println("Clam pizza ordered");
    }

    @Override
    public void prepare() {
        System.out.println("Throw on some clam");

    }
}

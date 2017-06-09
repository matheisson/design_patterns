package decorator.bevs;

import decorator.abstrct.Beverage;

/**
 * Created by levente on 2017.05.29..
 */
public class Espresso extends Beverage{

    @Override
    public double cost() {
        return 2.50;
    }

    public Espresso() {
        description = "Espresso beverage";
    }
}
package decorator.bevs;

import decorator.abstrct.Beverage;

/**
 * Created by levente on 2017.05.30..
 */
public class Latte extends Beverage {

    public Latte(){
        description = "Café Latte";
    }

    @Override
    public double cost() {
        return 2f;
    }
}

package decorator.condiment;

import decorator.abstrct.Beverage;
import decorator.abstrct.CondimentDecorator;

/**
 * Created by levente on 2017.05.30..
 */
public class Cream extends CondimentDecorator {

    Beverage beverage;

    public Cream(Beverage b) {
        this.beverage = b;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+", Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + .12;
    }
}

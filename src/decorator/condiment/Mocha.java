package decorator.condiment;

import decorator.abstrct.Beverage;
import decorator.abstrct.CondimentDecorator;

/**
 * Created by levente on 2017.05.29..
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .11 + beverage.cost();
    }
}

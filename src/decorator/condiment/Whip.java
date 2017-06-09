package decorator.condiment;

import decorator.abstrct.Beverage;
import decorator.abstrct.CondimentDecorator;

/**
 * Created by levente on 2017.05.29..
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage b){
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}

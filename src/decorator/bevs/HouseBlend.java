package decorator.bevs;

import decorator.abstrct.Beverage;

/**
 * Created by levente on 2017.05.29..
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

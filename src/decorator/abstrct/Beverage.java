package decorator.abstrct;

/**
 * Created by levente on 2017.05.29..
 */
public abstract class Beverage {

    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

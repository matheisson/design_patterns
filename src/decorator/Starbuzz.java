package decorator;

import decorator.abstrct.Beverage;
import decorator.bevs.HouseBlend;
import decorator.condiment.Cream;
import decorator.condiment.Mocha;
import decorator.condiment.Whip;

import java.text.DecimalFormat;

/**
 * Created by levente on 2017.05.29..
 */
public class Starbuzz {

    public static void main(String[] args) {

        Beverage bev2 = new HouseBlend();

        System.out.println(bev2.getDescription()+" $"+ bev2.cost()+"\n");

        bev2 = new Mocha(bev2);
        bev2 = new Cream(bev2);
        bev2 = new Whip(bev2);

        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println(bev2.getDescription()+" $"+ formatter.format(bev2.cost()));
    }
}

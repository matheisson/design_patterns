package factory2;

import factory2.impl.Addition;
import factory2.impl.Division;
import factory2.impl.Multiplication;
import factory2.impl.Subtraction;

/**
 * Created by levente on 2017.06.08..
 */
public class CalcFactory {

    public int performOp(int a, int b, String op){

        Operation operation = null;

        if ("*".equals(op)){
            operation = new Multiplication();
        } else if ("+".equals(op)){
            operation = new Addition();
        } else if ("-".equals(op)){
            operation = new Subtraction();
        } else if ("/".equals(op)){
            operation = new Division();
        } else {
            System.out.println("Invalid Operation");
            return -1;
        }

        return operation.operation(a,b);
    }
}

package factory2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by levente on 2017.06.08..
 */
public class Main {

    public static void main(String[] args) {

        int a, b, result;
        CalcFactory factory = new CalcFactory();

        System.out.println("Enter a number:");
        Scanner reader = new Scanner(System.in);

        try {
            a = reader.nextInt();
            System.out.println("Enter an Operation (+, *, /, -)");
            String op = reader.next();
            System.out.println("Enter the second number:");
            b = reader.nextInt();
            result = factory.performOp(a,b,op);

            System.out.println("The result of "+a+" "+op+" "+b+" = "+result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}

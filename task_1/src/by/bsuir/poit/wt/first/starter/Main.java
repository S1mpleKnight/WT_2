package by.bsuir.poit.wt.first.starter;

import by.bsuir.poit.wt.first.calculator.ExpressionCalculator;
import by.bsuir.poit.wt.first.reader.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter x: ");
        double x = ConsoleReader.readNumber();
        System.out.println("Enter y: ");
        double y = ConsoleReader.readNumber();
        System.out.printf("The result is %f", ExpressionCalculator.getInstance().getResult(x,y));
    }
}

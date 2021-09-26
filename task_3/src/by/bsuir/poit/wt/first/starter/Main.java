package by.bsuir.poit.wt.first.starter;

import by.bsuir.poit.wt.first.calculator.FunctionCalculator;
import by.bsuir.poit.wt.first.reader.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        double a = ConsoleReader.readNumber();
        System.out.println("Enter b:");
        double b = ConsoleReader.readNumber();
        System.out.println("Enter step:");
        double step = Math.abs(ConsoleReader.readNumber());
        FunctionCalculator.calculate(a, b, step)
                .forEach((v, f) -> System.out.printf("%10.3f|%10.3f|\n----------+----------+\n", v, f));
    }
}

package by.bsuir.poit.wt.first.starter;

import by.bsuir.poit.wt.first.reader.ConsoleReader;
import by.bsuir.poit.wt.first.search.IntervalSearcher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter first array size:");
        int firstSize = ConsoleReader.readNumber();
        System.out.println("Enter numbers");
        double[] firstArray = ConsoleReader.readArray(firstSize);

        System.out.println("Enter second array size:");
        int secondSize = ConsoleReader.readNumber();
        System.out.println("Enter numbers");
        double[] secondArray = ConsoleReader.readArray(secondSize);

        IntervalSearcher.searchHoles(firstArray, secondArray).forEach(System.out::println);
    }
}

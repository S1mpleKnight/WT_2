package by.bsuir.poit.wt.first.starter;

import by.bsuir.poit.wt.first.reader.ConsoleReader;
import by.bsuir.poit.wt.first.sort.ShellSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size:");
        int size = ConsoleReader.readNumber();
        System.out.println("Enter numbers");
        double[] numbers = ConsoleReader.readArray(size);
        ShellSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

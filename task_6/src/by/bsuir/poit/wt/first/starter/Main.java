package by.bsuir.poit.wt.first.starter;

import by.bsuir.poit.wt.first.generation.MatrixGenerator;
import by.bsuir.poit.wt.first.reader.ConsoleReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size:");
        int size = ConsoleReader.readNumber();
        System.out.println("Enter numbers");
        double[] numbers = ConsoleReader.readArray(size);
        double[][] matrix = MatrixGenerator.generateMatrix(numbers);
        for (double[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }
}

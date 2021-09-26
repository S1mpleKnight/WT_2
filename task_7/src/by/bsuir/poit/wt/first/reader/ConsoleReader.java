package by.bsuir.poit.wt.first.reader;

import java.util.Scanner;

public class ConsoleReader {
    public static int readNumber() {
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
            in.next();
        }
        return in.nextInt();
    }

    public static double[] readArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = readNumber();
        }
        return array;
    }
}

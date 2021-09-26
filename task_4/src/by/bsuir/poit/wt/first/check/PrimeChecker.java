package by.bsuir.poit.wt.first.check;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeChecker {
    public static List<Integer> checkArrayNumbers(int[] array) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (BigInteger.valueOf(array[i]).isProbablePrime(8)) {
                positions.add(i + 1);
            }
        }
        return positions;
    }
}

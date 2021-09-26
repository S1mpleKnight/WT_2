package by.bsuir.poit.wt.first.comparator;

import java.util.Comparator;

public class AlphabetComparator implements Comparator<String> {
    private static AlphabetComparator instance;

    private AlphabetComparator() {
    }

    public static AlphabetComparator getInstance() {
        if (instance == null) {
            instance = new AlphabetComparator();
        }
        return instance;
    }

    @Override
    public int compare(String first, String second) {
        char[] firstChars = first.toCharArray();
        for (int i = 0; i < firstChars.length; i++) {
            if (firstChars[i] == second.charAt(i)) {
                continue;
            }
            if (firstChars[i] > second.charAt(i)) {
                return 1;
            }
            if (firstChars[i] < second.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public Comparator<String> thenComparing(Comparator<? super String> other) {
        return Comparator.super.thenComparing(other);
    }
}

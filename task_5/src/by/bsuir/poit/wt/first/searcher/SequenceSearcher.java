package by.bsuir.poit.wt.first.searcher;

public class SequenceSearcher {
    public static int sequenceSearch(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int current = array[i];
            int amount = getExcludedAmount(array, i, current) + i;
            minValue = Math.min(amount, minValue);
        }
        return minValue;
    }

    private static int getExcludedAmount(int[] array, int i, int current) {
        int amount = 0;
        for (int j = i + 1; j < array.length; j++) {
            if (current > array[j]) {
                amount++;
            }
            current = array[j];
        }
        return amount;
    }
}

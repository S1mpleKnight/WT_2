package by.bsuir.poit.wt.first.search;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IntervalSearcher {
    public static List<String> searchHoles(double[] firstArray, double[] secondArray) {
        return checkLowerValues(firstArray, secondArray);
    }

    private static List<String> checkLowerValues(double[] firstArray, double[] secondArray) {
        return firstArray[0] >= secondArray[secondArray.length - 1]
                ? List.of(".. , " + firstArray[0])
                : checkUpperValues(firstArray, secondArray);
    }

    private static List<String> checkUpperValues(double[] firstArray, double[] secondArray) {
        return firstArray[firstArray.length - 1] <= secondArray[0]
                ? List.of(firstArray[firstArray.length - 1] + ", ..")
                : searchBetween(firstArray, secondArray);
    }

    private static List<String> searchBetween(double[] firstArray, double[] secondArray) {
        Set<String> intervals = new LinkedHashSet<>();
        int firstCurrent = 0, secondCurrent = 0;
        while (firstCurrent < firstArray.length){
            while (secondArray[secondCurrent] < firstArray[firstCurrent]) {
                secondCurrent++;
                populateIntarvals(firstArray, intervals, firstCurrent);
            }
            firstCurrent++;
        }
        checkRemains(firstArray, secondArray, intervals, firstCurrent, secondCurrent);
        return intervals.stream().toList();
    }

    private static void checkRemains(double[] firstArray, double[] secondArray, Set<String> intervals, int firstCurrent, int secondCurrent) {
        if (secondCurrent < secondArray.length) {
            intervals.add(firstArray[--firstCurrent] + ", ..");
        }
    }

    private static void populateIntarvals(double[] firstArray, Set<String> intervals, int firstCurrent) {
        if (firstCurrent != 0) {
            intervals.add(firstArray[firstCurrent - 1] + ", .. , " + firstArray[firstCurrent]);
        } else {
            intervals.add(".., " + firstArray[firstCurrent]);
        }
    }
}

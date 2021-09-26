package by.bsuir.poit.wt.first.calculator;

public class ExpressionCalculator {
    private static ExpressionCalculator instance;

    private ExpressionCalculator() {
    }

    public static ExpressionCalculator getInstance() {
        if (instance == null) {
            instance = new ExpressionCalculator();
        }
        return instance;
    }

    public double getResult(double x, double y) {
        return evaluateExpression(x, y);
    }

    private double calculateNumerator(double x, double y) {
        return 1 + Math.pow(Math.sin(x + y), 2);
    }

    private double calculateDenominator(double x, double y) {
        return 2 +  Math.abs(x - 2 * x / (1 + Math.pow(x * y, 2)));
    }

    private double evaluateExpression(double x, double y) {
        return calculateNumerator(x, y) / calculateDenominator(x, y) + x;
    }
}

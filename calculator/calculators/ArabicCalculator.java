package calculator.calculators;

public class ArabicCalculator implements Calculator {
    @Override
    public String calculate(String operand1, String operation, String operand2) {
        int oper1 = Integer.parseInt(operand1);
        int oper2 = Integer.parseInt(operand2);
        return ((Integer) Calculator.basicCalculate(oper1, operation, oper2)).toString();
    }
}

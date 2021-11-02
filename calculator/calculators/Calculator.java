package calculator.calculators;

import calculator.exceptions.CalcException;

public interface Calculator {
    String calculate(String operand1, String operation, String operand2) throws CalcException;

    static int basicCalculate(int oper1, String operation, int oper2) {
        int result = 0;
        switch (operation) {
            case "+": {
                result = oper1 + oper2;
                break;
            }
            case "-": {
                result = oper1 - oper2;
                break;
            }
            case "*": {
                result = oper1 * oper2;
                break;
            }
            case "/": {
                result = oper1 / oper2;
                break;
            }
        }
        return result;
    }
}

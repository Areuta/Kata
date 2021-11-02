package calculator;

import calculator.exceptions.CalcException;

public class CalculatorMain {
    public static void main(String[] args) {
        try {
            CalcManager.checkInput();
        } catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }
}

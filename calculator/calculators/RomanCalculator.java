package calculator.calculators;

import calculator.exceptions.CalcException;

import static calculator.CalcManager.romanNumerals;

public class RomanCalculator implements Calculator {
    @Override
    public String calculate(String operand1, String operation, String operand2) throws CalcException {
        int oper1 = romanNumerals.indexOf(operand1) + 1;
        int oper2 = romanNumerals.indexOf(operand2) + 1;
        return arabicToRoman(Calculator.basicCalculate(oper1, operation, oper2));
    }


    public static String arabicToRoman(int number) throws CalcException {
        if (number < 1 || number > 100) {
            throw new CalcException("невозможно получить такое римское число.");
        }
        StringBuilder sb = new StringBuilder();
        while (number >= 100) {
            sb.append("C");
            number -= 100;
        }
        while (number >= 90) {
            sb.append("XC");
            number -= 90;
        }
        while (number >= 50) {
            sb.append("L");
            number -= 50;
        }
        while (number >= 40) {
            sb.append("XL");
            number -= 40;
        }
        while (number >= 10) {
            sb.append("X");
            number -= 10;
        }
        while (number >= 9) {
            sb.append("IX");
            number -= 9;
        }
        while (number >= 5) {
            sb.append("V");
            number -= 5;
        }
        while (number >= 4) {
            sb.append("IV");
            number -= 4;
        }
        while (number >= 1) {
            sb.append("I");
            number -= 1;
        }
        return sb.toString();
    }
}
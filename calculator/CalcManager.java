package calculator;

import calculator.calculators.ArabicCalculator;
import calculator.calculators.RomanCalculator;
import calculator.exceptions.CalcException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class CalcManager {
    private static final String arabicReg = "(\\d|10)";
    public static final List<String> romanNumerals
            = Arrays.asList(new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X"});
    private static final List<String> operations = Arrays.asList(new String[]{"+", "-", "*", "/"});

    public static void checkInput() throws CalcException {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        if (input.length > 3) {
            throw new CalcException("введено слишком много данных.");
        }
        if (input.length < 3) {
            throw new CalcException("введено слишком мало данных.");
        }
        if (!operations.contains(input[1])) {
            throw new CalcException("нет такой операции.");
        }

        boolean arabicArg1 = input[0].matches(arabicReg);
        boolean arabicArg2 = input[2].matches(arabicReg);
        boolean romanArg1 = romanNumerals.contains(input[0]);
        boolean romanArg2 = romanNumerals.contains(input[2]);

        if (!(arabicArg1 && arabicArg2 || romanArg1 && romanArg2)) {
            throw new CalcException("нужно использовать все только арабские или все только римские числа от 1 до 10.");
        }

        if (arabicArg1 && arabicArg2) {
            System.out.println(new ArabicCalculator().calculate(input[0], input[1], input[2]));
        }

        if (romanArg1 && romanArg2) {
            System.out.println(new RomanCalculator().calculate(input[0], input[1], input[2]));
        }

    }

}

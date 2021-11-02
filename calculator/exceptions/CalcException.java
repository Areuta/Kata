package calculator.exceptions;

public class CalcException extends Exception {
    public CalcException(String message) {
        super("Исключение: " + message);
    }
}

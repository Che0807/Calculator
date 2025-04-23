package Lv3;

public enum OperatorType {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private final String symbol;
    private final Num operation;

    // 생성자
    OperatorType(String symbol, Num operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    // 연산 수행 메서드
    public double getResult(double num1, double num2) {
        return operation.value(num1, num2);
    }

    // 연산자의 기호 반환
    public String getSymbol() {
        return symbol;


    }
}
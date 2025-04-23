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

    // 연산자 기호를 기반으로 해당하는 OperatorType을 반환하는 메서드
    public static OperatorType fromSymbol(String input) {
        for (OperatorType op : values()) {
            if (op.getSymbol().equals(input)) {
                return op;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
    }
}

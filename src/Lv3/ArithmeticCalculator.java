package Lv3;

import java.util.Scanner;

public class ArithmeticCalculator {

    // 연산자와 숫자를 입력받아 계산하는 메서드
    public double calculate(double num1, double num2, String operatorSymbol) {
        // 연산자 기호에 맞는 OperatorType을 찾음
        OperatorType operator = OperatorType.fromSymbol(operatorSymbol);

        // 찾은 연산자를 이용해 연산 수행
        return operator.getResult(num1, num2);
    }

    // 사용자 입력을 받아서 계산하고 출력하는 메서드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        // 숫자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();

        // 연산자 입력 받기
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        String operatorSymbol = scanner.next();

        // 계산 수행
        double result = calculator.calculate(num1, num2, operatorSymbol);

        // 결과 출력
        System.out.println("결과: " + result);

        scanner.close();
    }
}

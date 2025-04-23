package Lv3;

import java.util.Scanner;

public class ArithmeticCalculator {
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


        // 결과 출력
        System.out.println("결과: " + result);
    }
}

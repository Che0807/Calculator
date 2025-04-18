package Lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char mathSymbol = sc.next().charAt(0);

            calculator.calculate(num1, num2, mathSymbol);

            System.out.println("계속하려면 아무 키나 입력하세요. 'delete' 입력 시 결과 삭제, 'exit' 입력 시 종료");
            userInput = sc.next();

            if (userInput.equals("delete")) {
                calculator.removeFirst();
            }

        } while (!userInput.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}

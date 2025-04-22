package Lv1;

import java.util.Scanner;

public class App {

    private Scanner sc = new Scanner(System.in); // 인스턴스 필드

    public static void main(String[] args) {
        App app = new App(); // App 인스턴스 생성
        app.run();           // run 메서드 실행
    }

    // 메인 로직을 실행하는 인스턴스 메서드
    public void run() {
        int result = 0;
        String continuePrompt;

        // 계산 반복 루프
        do {
            // 1. 첫 번째 숫자 입력
            int num1 = getPositiveInteger("첫 번째 숫자를 입력하세요: ");

            // 2. 두 번째 숫자 입력
            int num2 = getPositiveInteger("두 번째 숫자를 입력하세요: ");

            // 3. 연산 기호 입력
            System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char mathSymbol = sc.next().charAt(0);

            // 4. 연산 수행
            if (mathSymbol == '+') {
                result = num1 + num2;
            } else if (mathSymbol == '-') {
                result = num1 - num2;
            } else if (mathSymbol == '*') {
                result = num1 * num2;
            } else if (mathSymbol == '/') {
                if (num2 == 0) {
                    System.out.println("오류: 0으로는 나눌 수 없습니다. 다시 시도해주세요.");
                } else {
                    result = num1 / num2;
                }
            }

            // 5. 결과 출력
            System.out.println("결과: " + result);

            // 6. 계속할지 물어보기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            continuePrompt = sc.next();

        } while (!continuePrompt.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }

    // 양의 정수(0 포함)만 입력받는 인스턴스 메서드
    private int getPositiveInteger(String prompt) {
        int num;

        while (true) {
            System.out.print(prompt);

            if (sc.hasNextInt()) {
                num = sc.nextInt();

                if (num >= 0) {
                    return num;
                } else {
                    System.out.println("양의 정수(0 포함)만 입력하세요.");
                }

            } else {
                System.out.println("숫자만 입력 가능합니다!");
                sc.next(); // 잘못된 입력 제거
            }
        }
    }

    // 유효한 사칙연산 기호만 입력받는 인스턴스 메서드
    public char getValidMathSymbol() {
        String input;

        while (true) {
            System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            input = sc.next();

            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("잘못된 연산 기호입니다. 다시 입력해주세요.");
            }
        }
    }
}

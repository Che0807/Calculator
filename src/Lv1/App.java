package Lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        String continuePrompt;

        do {
            // 첫 번째 숫자 입력 (양의 정수만 받기)
            int num1 = getPositiveInteger(sc, "첫 번째 숫자를 입력하세요: ");

            // 두 번째 숫자 입력 (양의 정수만 받기)
            int num2 = getPositiveInteger(sc, "두 번째 숫자를 입력하세요: ");

            System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char mathSymbol = sc.next().charAt(0);

            // 연산 수행
            if (mathSymbol == '+') result = num1 + num2;
            else if (mathSymbol == '-') result = num1 - num2;
            else if (mathSymbol == '*') result = num1 * num2;
            else if (mathSymbol == '/') {
                if (num2 == 0) {
                    System.out.println("오류: 0으로는 나눌 수 없습니다. 다시 시도해주세요.");
                } else {
                    result = num1 / num2;
                }
            }

            // 결과 출력
            System.out.println("결과: " + result);

            // 계속 진행 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            continuePrompt = sc.next();
        } while (!continuePrompt.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }

    // 양의 정수만 입력받는 메서드
    private static int getPositiveInteger(Scanner sc, String prompt) {
        int num;
        while (true) {
            System.out.print(prompt);
            num = sc.nextInt();
            if (num >= 0) {
                break;  // 양의 정수이므로 루프 탈출
            } else {
                System.out.println("양의 정수(0 포함)만 입력하세요.");
            }
        }
        return num;
    }
}

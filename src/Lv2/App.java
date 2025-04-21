package Lv2;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            // 첫 번째 숫자 입력 (양의 정수만 입력받기)
            int num1 = getPositiveInteger(sc, "첫 번째 숫자를 입력하세요: ");

            // 두 번째 숫자 입력 (양의 정수만 입력받기)
            int num2 = getPositiveInteger(sc, "두 번째 숫자를 입력하세요: ");

            // 연산 기호 입력
            char mathSymbol = Calculator.getValidMathSymbol(sc);


            // 계산 결과가 성공적으로 처리되었는지 확인
            boolean isCalculated = calculator.calculate(num1, num2, mathSymbol);

            if (isCalculated) {
                List<Integer> resultList = calculator.getResultList();
                int lastResult = resultList.get(resultList.size() - 1);
                System.out.println("계산 결과: " + lastResult);
            }

            // 사용자 입력 받기 (계속 진행 or 삭제, 종료)
            System.out.println("계속하려면 아무 키나 입력하세요. 'delete' 입력 시 결과 삭제, 'exit' 입력 시 종료");
            userInput = sc.next();

            if (userInput.equals("delete")) {
                calculator.removeFirst();
            }

        } while (!userInput.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
        calculator.printAllResults();

    }
    private static int getPositiveInteger(Scanner sc, String prompt) {
        int num;

        while (true) {
            System.out.print(prompt);

            // 정수인지 먼저 검사
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num >= 0) {
                    continue;
                } else {
                    System.out.println("양의 정수(0 포함)만 입력하세요.");
                }
            } else {
                System.out.println("숫자만 입력 가능합니다!");
                sc.next(); // 잘못된 입력(문자열 등) 버리기
            }
        }
    }

}

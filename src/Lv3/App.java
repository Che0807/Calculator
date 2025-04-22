package Lv3;

import java.util.List;
import java.util.Scanner;

public class App {

    private static final String deleteList = "delete";
    private static final String programExit = "exit";

    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            // 첫 번째 숫자 입력 (양의 정수만 입력받기)
            int num1 = getPositiveInteger(sc, "첫 번째 숫자를 입력하세요: ");

            // 두 번째 숫자 입력 (양의 정수만 입력받기)
            int num2 = getPositiveInteger(sc, "두 번째 숫자를 입력하세요: ");

            // 연산 기호 입력
            char mathSymbol = ArithmeticCalculator.getValidMathSymbol(sc);

            // 계산 수행
            boolean isCalculated = calculator.calculate(num1, num2, mathSymbol);

            // 결과 출력
            if (isCalculated) {
                List<Integer> resultList = calculator.getResultList();
                int lastResult = resultList.get(resultList.size() - 1);
                System.out.println("계산 결과: " + lastResult);
            }

            // 다음 동작 확인
            System.out.println("계속하려면 아무 키나 입력하세요. '" + deleteList + "' 입력 시 결과 삭제, '" + programExit + "' 입력 시 종료");
            userInput = sc.next();

            if (userInput.equals(deleteList)) {
                calculator.removeFirst();
            }

        } while (!userInput.equals(programExit));

        System.out.println("프로그램을 종료합니다.");
        calculator.printAllResults();
    }

    // 양의 정수 입력 메서드
    private static int getPositiveInteger(Scanner sc, String prompt) {
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
}

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
            int num1 = calculator.getPositiveInteger(sc, "첫 번째 숫자를 입력하세요: ");
            int num2 = calculator.getPositiveInteger(sc, "두 번째 숫자를 입력하세요: ");
            char mathSymbol = calculator.getValidMathSymbol(sc);

            boolean isCalculated = calculator.calculate(num1, num2, mathSymbol);

            if (isCalculated) {
                List<Integer> resultList = calculator.getResultList();
                int lastResult = resultList.get(resultList.size() - 1);
                System.out.println("계산 결과: " + lastResult);
            }

            System.out.println("계속하려면 아무 키나 입력하세요. '" + deleteList + "' 입력 시 결과 삭제, '" + programExit + "' 입력 시 종료");
            userInput = sc.next();

            if (userInput.equals(deleteList)) {
                calculator.removeFirst();
            }

        } while (!userInput.equals(programExit));

        System.out.println("프로그램을 종료합니다.");
        calculator.printAllResults();
    }
}

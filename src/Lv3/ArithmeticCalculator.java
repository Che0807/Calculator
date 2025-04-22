package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticCalculator {

    private final List<Integer> resultList = new ArrayList<>();

    // 계산 기능
    public boolean calculate(int num1, int num2, char mathSymbol) {
        int result = 0;
        boolean isCalculated = true;

        switch (mathSymbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    isCalculated = false;
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                isCalculated = false;
                System.out.println("잘못된 연산 기호입니다.");
        }

        if (isCalculated) {
            resultList.add(result);
        }

        return isCalculated;
    }

    // 결과 리스트 반환
    public List<Integer> getResultList() {
        return resultList;
    }

    // 가장 먼저 저장된 결과 삭제
    public void removeFirst() {
        if (!resultList.isEmpty()) {
            int removed = resultList.remove(0);
            System.out.println("삭제된 결과: " + removed);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    // 저장된 결과 모두 출력
    public void printAllResults() {
        if (resultList.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            System.out.println("\n[저장된 결과 목록]");
            for (int i = 0; i < resultList.size(); i++) {
                System.out.printf("%d번째 결과: %d%n", i + 1, resultList.get(i));
            }
        }
    }

    // 유효한 사칙연산 기호 입력
    public static char getValidMathSymbol(Scanner sc) {
        String input;
        while (true) {
            System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            input = sc.next();
            if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                return input.charAt(0);
            } else {
                System.out.println("잘못된 연산 기호입니다. 다시 입력해주세요.");
            }
        }
    }
}

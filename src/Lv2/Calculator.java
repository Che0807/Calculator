package Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Integer> resultList = new ArrayList<>();

    // 계산 기능
    public void calculate(int num1, int num2, char mathSymbol) {
        int result;

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
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    isCalculated = false;
                    return;  // 계산을 중단하고 반환
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산 기호입니다.");
                isCalculated = false;
                return;  // 잘못된 연산 기호일 경우 계산을 중단하고 반환
        }

        resultList.add(result);  // 계산 결과를 리스트에 저장
    }

    // 가장 먼저 저장된 결과 삭제하는 메서드
    public void removeFirst() {
        if (!resultList.isEmpty()) {
            int removed = resultList.remove(0);
            System.out.println("삭제된 결과: " + removed);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    // 결과 리스트 반환
    public List<Integer> getResultList() {
        return resultList;
    }
}

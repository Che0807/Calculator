package Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

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

        // 계산된 결과가 있을 경우에만 리스트에 추가
        if (isCalculated) {
            resultList.add(result);
        }

        return isCalculated;
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

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        // 1. null 값 방지
        if (resultList == null) {
            System.out.println("오류: null 리스트는 설정할 수 없습니다.");
            return;
        }

        // 2. 음수 값 방지
        for (Integer value : resultList)
            if (value < 0) {
                System.out.println("오류: 음수 값은 허용되지 않습니다.");
                return;
            }
    }
}

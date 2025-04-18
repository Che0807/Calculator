package Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> resultList = new ArrayList<>();

    public int calculate(int num1, int num2, char mathSymbol) {
        int result = 0;
        boolean isCalculated = true;

        if (mathSymbol == '+') {
            result = num1 + num2;
        } else if (mathSymbol == '-') {
            result = num1 - num2;
        } else if (mathSymbol == '*') {
            result = num1 * num2;
        } else if (mathSymbol == '/') {
            if (num2 == 0) {
                System.out.println("오류: 0으로는 나눌 수 없습니다.");
                isCalculated = false;
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("잘못된 연산 기호입니다.");
            isCalculated = false;
        }

        if (isCalculated) {
            System.out.println("계산 결과: " + result);
            resultList.add(result);
        }

        return result;
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
        for (Integer value : resultList) {
            if (value < 0) {
                System.out.println("오류: 음수 값은 허용되지 않습니다.");
                return;
            }
        }

        // 3. 조건을 통과하면 저장
        this.resultList = resultList;
    }
}




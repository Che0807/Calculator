import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> resultList = new ArrayList<>();

    int result = 0;

        if (mathSymbol == '+') {
        result = num1 + num2;
    } else if (mathSymbol == '-') {
        result = num1 - num2;
    } else if (mathSymbol == '*') {
        result = num1 * num2;
    } else if (mathSymbol == '/') {
        // 나눗셈은 0으로 나눌 수 없으니까 예외 처리
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            result = num1 / num2;
        }
    } else {
        System.out.println("잘못된 연산 기호입니다.");
    }

        resultList.add(result);

        return result;
}
}





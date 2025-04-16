import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        String continuePrompt;

        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char mathSymbol = sc.next().charAt(0);

            if (mathSymbol == '+') result = num1 + num2;
            else if (mathSymbol == '-') result = num1 - num2;
            else if (mathSymbol == '*') result = num1 * num2;
            else if (mathSymbol == '/') {
                if (num2 == 0) {
                    System.out.println("오류: 0으로는 나눌 수 없습니다. 다시 시도해주세요.");
                } else
                    result = num1 / num2;
            }
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            continuePrompt = sc.next();
        } while (!continuePrompt.equals("exit"));
    }
}

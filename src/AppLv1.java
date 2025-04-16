import java.util.Scanner;

public class AppLv1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        String mathsymbols = sc.next();

        int result = 0;
        if (mathsymbols.equals("+")) {
            result = num1 + num2;
        } else if (mathsymbols.equals("-")) {
            result = num1 - num2;
        } else if (mathsymbols.equals("*")) {
            result = num1 * num2;
        }else if (mathsymbols.equals("/")) {
            result = num1 / num2;
        }else System.out.println("옳 바른 연산 기호와 정수를 입력해주세요");

        System.out.println("결과: " + result);
    }
}

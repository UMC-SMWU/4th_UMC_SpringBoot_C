import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.close();
        try {
            int result = num / 10;
            System.out.println("Result: " + result);
            // 0으로 나누려고하면 예외처리
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

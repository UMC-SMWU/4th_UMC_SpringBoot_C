// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나눠질 숫자를 입력하세요.: ");
        int a = sc.nextInt();
        System.out.print("나눌 숫자를 입력하세요.: ");
        int b = sc.nextInt();

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        } finally {
            sc.close();
        }
    }
}


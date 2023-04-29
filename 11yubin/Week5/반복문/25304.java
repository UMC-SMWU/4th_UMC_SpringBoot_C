import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int num = sc.nextInt();

        int sum = 0, n = 0, p = 0;
        for (int i=0; i<num; i++) {
            n = sc.nextInt();
            p = sc.nextInt();
            sum += n*p;
        }
        sc.close();

        if (sum == price) System.out.println("Yes");
        else System.out.println("No");
    }
}
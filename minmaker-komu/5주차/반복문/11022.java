import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for(int i = 1; i < T+1; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b+ " = "+ (a+b));
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        sc.close();

        if (min < 45) {
            min = min + 60;
            hour = hour - 1;
        }
        if (hour==-1) hour = hour + 24;
        min = min - 45;
        System.out.println(hour + " " + min);
    }
}
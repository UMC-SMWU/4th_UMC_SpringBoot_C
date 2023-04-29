import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        min = min + time%60;
        hour = (hour + time/60 + min/60)%24;
        min = min%60;

        System.out.println(hour + " " + min);
    }
}
package 조건문;

import java.util.Scanner;

public class br3_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        h += time / 60;
        m += time % 60;

        if (m >= 60) {
            h++;
            m -= 60;
        }
        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}

package 배열_1D;

import java.util.Scanner;

public class br1_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        double sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] >= max) {
                max = scores[i];
            }
        }
        for (int i = 0; i < n; i++) {
            sum += ((double) scores[i] / (double) max) * 100;
        }
        System.out.println(sum / n);
        sc.close();
    }
}

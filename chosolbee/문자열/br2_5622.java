package 문자열;

import java.util.Scanner;

public class br2_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();
        int time = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            time += timeperchar(ch);
        }
        System.out.println(time);
        sc.close();
    }

    private static int timeperchar(char ch) {
        int time = 0;

        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
                time = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                time = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                time = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                time = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                time = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                time = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                time = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                time = 9;
                break;
        }
        return time + 1;
    }
}

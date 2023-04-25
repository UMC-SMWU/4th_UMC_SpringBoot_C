package 배열_2차원;

import java.util.Scanner;

public class BOJ2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[9][9];

        int num=0;
        int n=1;
        int m=1;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int x=sc.nextInt();
                if(num<x){
                    num=x;
                    n=i+1;
                    m=j+1;
                }
            }
        }
        System.out.println(num);
        System.out.print(n+" "+m);

    }
}

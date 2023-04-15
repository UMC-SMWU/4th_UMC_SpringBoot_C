import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 정수 n개의 a수열에서 x보다 작은 수 모두 출력

        Scanner scan = new Scanner(System.in);
        // 정수 n
        int n = scan.nextInt();
        // 정수 x
        int x = scan.nextInt();
        // 수열 a를 이루는 정수들 n개
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            if(a < x){
                System.out.print(a+" ");
            }
        }
    }
}
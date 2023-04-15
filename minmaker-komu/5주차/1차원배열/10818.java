import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력받을 정수의 개수
        int n = scan.nextInt();


        // 첫번째 입력값을 최소값이자 최대값으로 설정
        int min = scan.nextInt();
        // 최대값
        int max = min;

        // 그 다음으로 입력받을 정수들
        for(int i=1; i<n; i++){
            int a = scan.nextInt();
            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }
        }
        System.out.println(min+" "+max);

    }
}

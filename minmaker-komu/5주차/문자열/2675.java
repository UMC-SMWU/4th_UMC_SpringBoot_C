import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 단어 개수입력
        int n = scan.nextInt();

        // 반복 횟수랑 단어 입력
        for(int i=0; i<n; i++) {

            int r = scan.nextInt();
            String s = scan.next();

            for(int j = 0; j < s.length(); j++){
                for(int k=0; k < r; k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();


        }
    }
}

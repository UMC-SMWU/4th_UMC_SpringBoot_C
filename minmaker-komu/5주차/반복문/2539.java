import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=1; i<n+1; i++){

            for(int j=1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<i+1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
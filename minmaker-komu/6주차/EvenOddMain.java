public class EvenOddMain {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (EvenOdd.isEven(i)) {
                System.out.println(i + "은(는) 짝수입니다.");
            }
        }
    }
}

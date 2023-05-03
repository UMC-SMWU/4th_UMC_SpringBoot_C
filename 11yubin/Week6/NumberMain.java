public class NumberMain {
    public static void main(String[] args) {
        Number n = new Number();
        System.out.println(n.isEven(3));
        System.out.println(n.isEven(24));

        for (int i=1; i<=10; i++) {
            if (n.isEven(i)) System.out.print(i + " ");
        }
    }
}

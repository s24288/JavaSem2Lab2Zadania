import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int number = scanner.nextInt();
        isEven(number);
    }

     public static void isEven(int x) {
         if (x % 2 == 0) {
             System.out.println(x + " jest parzysta");
         } else {
             System.out.println(x + " jest nieparzysta");
         }
     }
}


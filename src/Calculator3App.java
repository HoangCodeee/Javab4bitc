import java.util.Scanner;

public class Calculator3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator3 calculator = new Calculator3();

        System.out.print("Enter a positive integer n = ");
        int n = scanner.nextInt();

        calculator.printPrimeFactors(n);

        scanner.close();
    }
}

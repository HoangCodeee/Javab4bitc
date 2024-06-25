import java.util.Scanner;

public class Calculator2App {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao gia tri cua n: ");
        int n = scanner.nextInt();
        int sumOfProduct = calculator.calculateSumOfProduct(n);
        System.out.printf("Tong cua tich la %d%n", sumOfProduct);
        scanner.close();
    }
}

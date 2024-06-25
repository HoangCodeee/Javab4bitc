import java.util.Scanner;

public class Calculator {
    public int calculateSum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Enter number (or 'n' to calculate the sum): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid number. Please enter again.");
            }
        }
        sc.close();
        return sum;
    }

    public int calculateSumOfProduct(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateSumOfProduct'");
    }
}
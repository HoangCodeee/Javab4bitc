
public class Calculator3 {
    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int sqrtNum = (int) Math.sqrt(number) + 1;
        for (int i = 6; i <= sqrtNum; i += 6) {
            if (number % (i - 1) == 0 || number % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }
    public void printPrimeFactors(int n) {
        if (n <= 1) {
            System.out.println("No prime factors for number " + n);
            return;
        }
        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
                n = n / i;
            }
        }
        System.out.println();
    }
}

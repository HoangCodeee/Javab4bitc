public class Calculator2 {
    public int calculateSumOfProduct(int n) {
        int sum = 0;
        int product = 1;
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            product *= i;
            sum += product;
            if (i > 1) {
                expression.append(" + ");
            }
            expression.append(product);
        }
        System.out.println("Expressions have the form: " + expression.toString());
        return sum;
    }
}

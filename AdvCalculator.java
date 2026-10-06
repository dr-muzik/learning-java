public class AdvCalculator extends Calculator {

    
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // or throw an exception
        }
        return a / b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double pow(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

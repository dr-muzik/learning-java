import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        // Q: Find the largest of the 3 numbers
        // first result
        // int max = num1;
        // if (num2 > max) {
        // max = num2;
        // }
        // if (num3 > max) {
        // max = num3;
        // }

        // optimized result
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Largest number is: " + max);

        in.close();
    }
}

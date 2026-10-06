import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // from my head
        int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int nextValue = 0;

        // for (int i = 0; i <= n - 2; i++) {
        // nextValue = a + b;
        // System.out.println("The next value is " + nextValue);
        // a = b;
        // b = nextValue;
        // }

        // System.out.println("The " + n + "th value is " + nextValue);

        // correct version
        int prev = 0;
        int next = 1;
        int count = 2;

        while (count <= n) {
            int temp = next;
            next = next + prev;
            // if we say prev = next directly, it will take the value of the new next, not
            // the initial value
            // thus the need for 'temp'
            prev = temp;

            count++;
        }

        System.out.println("The " + n + "th value is " + next);

        in.close();
    }
}

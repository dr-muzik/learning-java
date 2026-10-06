public class MirrorNumber {
    public static void main(String[] args) {
        int n = 23597;
        // my work
        // String mirroString = "";
        // int mirroN = 0;
        // // int count = 0; //needed when we are dealing with freqency

        // while (n > 0) {
        // int rem = n % 10;
        // mirroString = mirroString.concat(String.valueOf(rem));

        // n /= 10;
        // }

        // mirroN = Integer.parseInt(mirroString);

        // System.out.println("the reverse is " + mirroN);

        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            n /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println("the reverse is " + ans);

    }
}

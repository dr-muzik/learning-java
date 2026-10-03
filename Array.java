public class Array {
    public static void main(String a[]) {
        // int arr[] = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        //========multi-dimensional array
        // int nums[][] = new int[3][4];

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums[i].length; j++) {
        //         nums[i][j] = (i + 1) * (j + 1);
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int num[] : nums) {
        //     for(int n : num){
        //         System.out.print(n + " ");
        //     }
        //     System.out.println();
        // }

        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
        BankAccount account1 = new BankAccount("Wisdom Peters", "129993123", 2000.0);
        BankAccount account2 = new BankAccount("Chigi Kingsley", "000234589", 3000.0);

        BankAccount accounts[] = {account, account1, account2};
        // System.out.println(account1);
        for (int i = 0; i < accounts.length; i++) {
            // accounts[i].deposit(500.0);
            if(accounts[i].balance < 2000.0) {
                accounts[i].deposit(500.0);
            }

        }

         for (BankAccount acc : accounts) {
            acc.showBalance();
        }

        
    }
}

class A {
    A() {
        System.out.println("A");
    }

    A(int a) {
        System.out.println("A with parameter: " + a);
    }
}
class B extends A {
    B() {
        super();
        System.out.println("B");
    }

    B(int a) {
        this();
        System.out.println("B with parameter: " + a);
    }
}

public void main(String a[]) {
    // BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
    // account.showBalance();
    // account.deposit(500.0);
    // account.showBalance();


    //Calculator
    // Calculator c = new Calculator();
    // int result = c.add(5, 3);

    // AdvCalculator advCalc = new AdvCalculator();
    // int mulResult = advCalc.mul(4, 6);
    // double powResult = advCalc.pow(2, 3);
    // System.out.println(result);
    // System.out.println(mulResult);
    // System.out.println(powResult);

    //understanding constructor chaining
    // B b1 = new B();
    B b2 = new B(5);
    // System.out.println("b1: " + b1);
    // System.out.println("b2: " + b2);
}
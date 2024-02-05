public class Calculator {
    // constructor
    public void Calculator() {

    }

    // add method
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // subtract method
    public int subtract(int a, int b) {
        int difference = a - b;
        return difference;
    }

    // multiply method
    public int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // divide method
    public int divide(int a, int b) {
        int divided = a / b;
        return divided;
    }

    // modulo method
    public int modulo(int a, int b) {
        int mod = a % b;
        return mod;
    }

    public static void main(String args[]) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}

package algorithm;

public class Application {
    public static void main(String[] args) {
        Fibonacci fibonacci = new FibonacciRecursive();
        System.out.println(fibonacci.getMemberValue(7));
    }
}


package Homework070322;

public class FibonacciArgs {

    public static long fibonacciPenultimate = 0;
    public static long fibonacciLast = 1;
    public static long nThFibonacci = 1;

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        if (n <= 2) {
            System.out.println(nThFibonacci);
            return;
        }
        nThFibonacci = fibonacciLast + fibonacciPenultimate;
        fibonacciPenultimate = fibonacciLast;
        fibonacciLast = nThFibonacci;
        args[0] = String.valueOf(n - 1);
        main(args);

    }
}


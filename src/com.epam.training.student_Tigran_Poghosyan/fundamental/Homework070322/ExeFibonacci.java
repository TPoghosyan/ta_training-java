package Homework070322;

import java.util.Scanner;

public class ExeFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please type any integer number > 1 and < 96 ");
        Long n = scanner.nextLong();
        Fibonacci fibonacci = new Fibonacci(n);
        fibonacci.countFibonacci();
        System.out.println("the " + n + "-th element of the fibonacci sequence is " + fibonacci.nThFibonacci);
    }
}

class Fibonacci {
    public long fibonacciPenultimate = 0;
    public long fibonacciLast = 1;
    public long nThFibonacci = 1;
    public long n;

    Fibonacci(long n) {
        this.n = n;
    }

    public void countFibonacci() {
        if (n <= 2) {
            return;
        }
        nThFibonacci = fibonacciLast + fibonacciPenultimate;
        fibonacciPenultimate = fibonacciLast;
        fibonacciLast = nThFibonacci;
        n--;
        countFibonacci();
    }
}



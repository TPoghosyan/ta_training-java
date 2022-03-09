//n	…	  −10	−9	−8	−7	−6	−5	−4	−3	−2	−1	0	1	2	3	4	5	6	7	8	9	10	…
//F_{n}	…	−55	34	−21	13	−8	5	−3	2	−1	 1  0	1	1	2	3	5	8	13	21	34	55	…
package Homework070322;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciExe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please type any integer number > -96 and < 96 ");
        int n = scanner.nextInt();
        Fibonacci2 fibonacci2 = new Fibonacci2();
        fibonacci2.countFibonacci(Math.abs(n));

        if (n < 0) {
            fibonacci2.nThFibonacci = (long) Math.pow(-1, n + 1) * fibonacci2.nThFibonacci;
        }
        if (n == 1 || n == -1){
            fibonacci2.nThFibonacci =1;
        }
        System.out.println("the " + n + "-th element of the fibonacci sequence is " + fibonacci2.nThFibonacci);
    }
}

class Fibonacci2 {
    public long fibonacciPenultimate = 0;
    public long fibonacciLast = 1;
    public long nThFibonacci = 0;

    public void countFibonacci(int n) {
        if (n <= 1) { 
            return;
        }
        nThFibonacci = fibonacciLast + fibonacciPenultimate;
        fibonacciPenultimate = fibonacciLast;
        fibonacciLast = nThFibonacci;
        countFibonacci(--n);


    }
}

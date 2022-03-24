
package main_task;

import java.util.Arrays;

public class CommandTaskArgsTask2 {
    public static void main(String[] args) {
        for (int i = args.length-1; i >= 0; i--) {
            System.out.print(args[i] + " ");
            System.out.println(args.length);
        }
    }

}




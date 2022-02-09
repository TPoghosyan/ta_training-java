package main_task.main_task;

import java.util.Arrays;

public class CommandLineArgsUsRecursion {
    public static void main(String[] args) {
        if (args.length == 0) return;
        System.out.print(args[args.length - 1] + " ");
        main(Arrays.copyOfRange(args,0,args.length-1));
    }
}

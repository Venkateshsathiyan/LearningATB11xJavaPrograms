package ex_06_TernaryOperator;

import java.util.Scanner;

public class CLI_Ternary_OP {
    public static void main(String[] args) {
       /* int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        System.out.println(value1>value2?"value1 is max "+value1:"value2 is max "+value2);
        // output will be*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter val1 and val2");
        int val1=sc.nextInt();
        int val2=sc.nextInt();
        int Res=(val1>val2)?val1:val2;
        System.out.println(Res);
    }
}

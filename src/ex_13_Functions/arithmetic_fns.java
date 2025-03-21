package ex_13_Functions;

import java.util.Scanner;

public class arithmetic_fns {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }
    static int mod(int a, int b)
    {
        return a%b;
    }
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a");
        if(sc.hasNextInt())
        {
             a= sc.nextInt();
        }
        else {
            System.out.println("Enter int value only");
            System.exit(0);
        }
        System.out.println("enter b");
        if(sc.hasNextInt())
        {
             b= sc.nextInt();
        }
        else {
            System.out.println("Enter int value only");
            System.exit(0);
        }

        int sum=add(a,b);
        System.out.println(sum);
        int subres=sub(a,b);
        System.out.println(subres);
        int multi=mul(a,b);
        System.out.println(multi);
        int Div=div(a,b);
        System.out.println(Div);
        int Mod=mod(a,b);
        System.out.println(Mod);
    }
}

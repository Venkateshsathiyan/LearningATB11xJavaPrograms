package Daywise_task;

import java.util.Scanner;

public class factorial_20_3 {
    public static void main(String[] args) {
//        factorial=5!=5*4*3*2*1
        int num,i,fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        num=sc.nextInt();
        for (i=1;i<=num;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }
    }
}

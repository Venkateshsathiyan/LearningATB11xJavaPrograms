package Daywise_task;

import java.util.Scanner;

public class fibanocci_series_20_3 {
    public static void main(String[] args) {
        //fibanocci=0,1,1,2,3,4,5...(adding previous 2 num)
        int n1=0,n2=1,n3,num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        num=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for (int i=0;i<num;i++)
        {

            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}

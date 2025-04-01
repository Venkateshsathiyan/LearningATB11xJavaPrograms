package ex_16_Array;

import java.util.Scanner;

public class Array_user_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
       int a= sc.nextInt();
       int mark[]=new int[a];
        for (int i=0;i<mark.length;i++)
        {
            mark[i]=sc.nextInt();
            System.out.println("mark["+i+"]="+mark[i]);
        }
        sc.close();
    }
}

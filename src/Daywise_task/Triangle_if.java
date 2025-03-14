package Daywise_task;

import java.util.Scanner;

public class Triangle_if {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a, b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a==b)&&(a==c)&&(b==c))
        {
            System.out.println("Acute angle");
        }
        else if ((a==b)&&(a!=c)&&(b!=c))
        {
            System.out.println("Isoceles angle");
        }
        else
        {
            System.out.println("scalene");
        }
    }
}

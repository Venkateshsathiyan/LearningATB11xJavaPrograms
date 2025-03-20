package Daywise_task;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
//       Using CLI
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        int sal = Integer.parseInt(args[2]);
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("sal=" + sal);
//        Using Scanner
      /*  Scanner sc= new Scanner(System.in);
        System.out.println("Name\tage\tsal");
        String Name= sc.next();
        int age= sc.nextInt();
        int sal=sc.nextInt();
        System.out.println("Name="+Name+"\n"+"age="+age+"\n"+"sal="+sal);*/
    }
}

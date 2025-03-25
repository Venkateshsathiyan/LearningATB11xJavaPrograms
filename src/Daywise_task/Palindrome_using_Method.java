package Daywise_task;

import java.util.Scanner;

public class Palindrome_using_Method {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String name=sc.next();
        String reverse=palindrome(name);
        if (reverse.equals(name))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        }
        public static String palindrome(String name)
        {
            String rev="";
           // int ch = name.length();
            for (int i=name.length()-1;i>=0;i--)
            {
                rev=rev+name.charAt(i);
            }
            return rev;
        }
}

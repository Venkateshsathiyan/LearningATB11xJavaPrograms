package Daywise_task;

import java.lang.annotation.ElementType;

public class Palindrome_string {
    public static void main(String[] args) {
        String name= "madam";
        String rev="";
        System.out.println("Name: "+name);
        char[] c= name.toCharArray();
        int l=c.length;
        System.out.println(l);
        for (int i=c.length-1;i>=0;i--)
        {
            rev= rev+ c[i];
            //System.out.println(rev);
        }
        System.out.println("Rev: "+rev);
       if(rev.equals(name))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

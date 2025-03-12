package Daywise_task;

public class operators {
    public static void main(String[] args) {
        int a=+10; // = is assignment operator
//        arithmetic operator
        int b=-20;
        int c =5;
        System.out.println(a+b);
        System.out.println(b+a);
        System.out.println(a-b);
        System.out.println(a*c);
        System.out.println(a/c);//gives quotient
        System.out.println(a%b);// gives remainder
//        Relational operator
        System.out.println("a>b="+(a>b));
        System.out.println("a<b="+(a<b));
        System.out.println("a==b is"+(a==b));
        System.out.println("a>=b is"+(a>=b));
        System.out.println("a<=b"+(a<=b));
        System.out.println("a!=b is"+!(a==b));
//        logical operator
        boolean x=true;
        boolean y=true;
        System.out.println("x="+!x);
        System.out.println("y="+!y);
        boolean z= x||y;
        System.out.println("z="+z);
        boolean v=x&y;
        System.out.println("v="+v);
        System.out.println("v="+!v);


    }
}

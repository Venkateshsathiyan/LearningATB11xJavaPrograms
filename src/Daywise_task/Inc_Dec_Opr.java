package Daywise_task;

public class Inc_Dec_Opr {
    public static void main(String[] args) {
        //        pre increment
        int a=10;
        System.out.println("a="+a);
        int res= a++; //value of a is assigned to res first then increment happens.
        System.out.println("Res="+res);
        System.out.println("a="+a);
//post increment
        int b=20;
        System.out.println("b="+b);
        int total = ++b;// increment happens then value of b assigned to total
        System.out.println("total="+total);
        System.out.println("b="+b);
//        pre decrement
        int c=16;
        System.out.println("c="+c);
        int score=c--;//value of c is assigned to score first then decrement happens.
        System.out.println("After decrement");
        System.out.println("score="+score);
        System.out.println("c="+c);
        //post decrement
        int d=10;
        System.out.println("d="+d);
        int sum=--d;// decrement happens then value of d assigned to sum
        System.out.println("after post decrement");
        System.out.println("sum="+sum);
        System.out.println("d="+d);
    }
}

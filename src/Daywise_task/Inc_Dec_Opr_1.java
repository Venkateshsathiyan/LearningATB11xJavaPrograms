package Daywise_task;

public class Inc_Dec_Opr_1 {
    public static void main(String[] args) {
        //System.out.println(++a + a++ + a++)
        int a=10,A,B,C;
        System.out.println("Result of a");
       // System.out.println(++a + a++ + a++);
        A=++a; //11
        System.out.println("A="+A);
        B=a++; //11
        System.out.println("B="+B);
        C=a++; //12
        System.out.println("C="+C);
        System.out.println("Result of Alphabets");//34
        System.out.println(A + B + C);
//        Decrement operator-System.out.println(--b + b++ + b--);
        int b=10,D,E,F;
        System.out.println("Result of b");
        D=--b; //9
        System.out.println("D="+D);
        E=b++; //9
        System.out.println("E="+E);
        F=b--;//10
        System.out.println("F="+F);
        System.out.println("Result of D,E,F");//28
        System.out.println(D+E+F);
    }
}

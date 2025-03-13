package Daywise_task;

public class Ternary_operator {
    public static void main(String[] args) {
      //  finding largest using 3 number
        int n1=10, n2=50, n3=30;
        int max=((n1>n2)&&(n1>n3))?n1:((n2>n3)&&(n2>n1))?n2:n3;
        System.out.println("max="+max);
//        Grade calculator
       // int mark=85;
        String mark=args[0];
        int score=Integer.parseInt(mark);
        System.out.println("Score="+score);
       String Grade=((score>=90)&&(score<=100))?"A":((score>=80)&&(score<=89))?"B":((score>=70)&&(score<=79))?"C":((score>=60)&&(score<=69))?"D":((score>=0)&&(score<=59))?"F":"O";
        System.out.println("Grade="+Grade);
    }
}

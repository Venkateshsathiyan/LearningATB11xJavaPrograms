package ex_06_TernaryOperator;

public class TO_p1 {
    public static void main(String[] args) {
//        ternary operator
        int age=18;
        String res=(age>=25)?"vote":"no_vote";
        System.out.println(res);
        //nested ternary
        int num=10;
        String result=(num>20)?"true":(num>15)?"true":"false";
        System.out.println("resul="+result);

    }
}

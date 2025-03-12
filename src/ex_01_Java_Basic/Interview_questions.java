package ex_01_Java_Basic;

public class Interview_questions
{
    public static void main(String[] args) {
//        concatination
        int a=10;
        int b=20;
        System.out.println(a+b);
        String c="Venkatesh";
        String d = "Sathiyan";
        System.out.println(c+d);
        System.out.println(a+b+c+d);
        System.out.println(d+c+b+a);
        System.out.println(d+c+(b+a));
        //boolean
        System.out.println(!(10>20));
        boolean e=(20==30);
        System.out.println(e);
//        char
        char f='A';
        char g='B';
        System.out.println("f="+f);//presemt the char
        System.out.println("g="+g);
        System.out.println("f+g="+(f+g));// if it is multiple with + then it add the values
        System.out.println("the result is "+('A'==65));
        short s=50;
        System.out.println("f+s="+(f+s));

    }
}

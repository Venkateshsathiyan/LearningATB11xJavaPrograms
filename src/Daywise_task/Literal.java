package Daywise_task;

public class Literal {
    public static void main(String[] args) {
//        value of variable is called as literals
        int a=10; // 10 is literal
        boolean venkatesh_working_TCS = true; //true is boolean literal
//        Final keyword is used for constant value which cannot be changed
        final float pi=3.14f;
        int Enum=50; // it is valid bcoz small "enum" is datatype/keyword but Enum is not
        System.out.println("a="+a);
        System.out.println("venkatesh_working_TCS ="+venkatesh_working_TCS );
        System.out.println("pi="+pi);
        //System.out.println(a+pi+venkatesh_working_TCS); //invalid operand we cannot compare int, float and boolean
// char literals
        char c10='A';
        char c11='B';
        System.out.println("c10="+c10);
        System.out.println("c11="+c11);
        System.out.println("c10+c11="+c10+c11);
        System.out.println("c10+c11="+(c10+c11));
        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("PramodDutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("venkatesh\nsathiyan");
        System.out.println("venkatesh\tsathiyan");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod is old"+carriage_return+"Dutta");
    }
}

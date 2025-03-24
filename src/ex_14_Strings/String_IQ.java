package ex_14_Strings;

public class String_IQ {
    public static void main(String[] args) {
        //values stores in String Constant Pool(SCP)
        String s1 = "Hello";
        String s4 = "Venkatesh"; // SCP -> 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello");

        //==
        System.out.println(s1==s3);// false
        System.out.println(s1==s2);// false
        System.out.println(s1==s5);// false
        System.out.println("Ans:"+(s1==s4));//True
        System.out.println(s2==s3);//False
        System.out.println(s2==s5);//false

        //equals
        System.out.println(s1.equals(s2));//true
        System.out.println(s4.equals(s5));//false
    }
}

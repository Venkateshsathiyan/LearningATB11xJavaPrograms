package ex_14_Strings;

public class String_IQ {
    public static void main(String[] args) {
        //values stores in String Constant Pool(SCP)
        String s1 = "Hello";
        String s3="Hello";
        String s4 = "hello"; // SCP -> 1

        String s2 = new String("Hello"); // OA
        String s5 = new String("Hello");
        String s6 = new String("hello");
        String s7=s2;

        System.out.println(s1==s3);//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s4);//false
        System.out.println(s1.equals(s4));//false
        System.out.println("s4="+s1.equalsIgnoreCase(s4));//true

        System.out.println(s2==s5);//false-compare the obj
        System.out.println(s2.equals(s5));//true-compare value
        System.out.println(s2==s6);//false
        System.out.println(s2.equals(s6));//false
        System.out.println(s2.equalsIgnoreCase(s6));//True
        System.out.println(s2==s7);//true

        System.out.println(s1==s2);//false-compare variable and obj
        System.out.println(s1.equals(s2));//true-compareing values
        System.out.println(s1.equalsIgnoreCase(s6));//true

    }
}

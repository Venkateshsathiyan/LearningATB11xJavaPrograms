package ex_14_Strings;

public class StringBuffer_Builder {
    public static void main(String[] args) {
        //string-- it is immutable
        String n="Venkatesh";
        String n1="Sathiyan";
        String n2= n+n1;
        String n3=n.concat("123");
        System.out.println(n3);
        System.out.println("n2="+n2);
        //String buffer- it is mutable
        StringBuffer Sbuf= new StringBuffer("Venkatesh");
        Sbuf.append("Kokila");
        System.out.println(Sbuf);
       //    System.out.println(Sbuf.reverse());
        Sbuf.replace(0,9,"Sathiyan");
        System.out.println("Sbuf="+Sbuf);

        //String builder- it is mutable
        StringBuilder Sbuf1= new StringBuilder("Venkatesh");
        Sbuf1.append("Dhivya");
        System.out.println(Sbuf1);
        System.out.println(Sbuf1.reverse());
       // System.out.println(Sbuf1.reverse().toString());
        Sbuf1.delete(5,10);
        System.out.println(Sbuf1);


    }
}

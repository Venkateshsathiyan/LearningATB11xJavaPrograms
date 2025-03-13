package ex_05_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {

/** Type casing- converting one datatype to another datatype
 * 2 types- explicit- manually we convert larger datatype to smaller(Narrowing). it has data loss
 * implicit-occur automatically smaller datatype to larger(Widening). it is safe and no data loss
 * */
short a=10;// example for implicit typecasting
int res=a;
        System.out.println("a="+a);
        System.out.println("res="+res);
//        example of explicit typecasting
        int b=50000;
        /** convert b into binary value
         * short datatype has only 8 bit. so there is data loss. so it gives the values as -15536
         */
        short c=(short)b;
        System.out.println("c="+c);
//example:
        int course=100;
        float gst= 18.45F;
//        int total = course + gst; //narrow=implicit throw error
        int total = course +(int)gst; //narrow-explicit
        // widening
        float total1=course+gst; //widening-automatic-implicit
        System.out.println("total1="+total1);
        float total2=(float)course+gst; //widening--explicit
        System.out.println("total2="+total2);
    }
}

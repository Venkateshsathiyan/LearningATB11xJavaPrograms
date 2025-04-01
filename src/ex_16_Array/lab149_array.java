package ex_16_Array;

public class lab149_array {
    public static void main(String[] args) {
        int a[]={1,2,8,9,10};
        int[] b={85,40,56,70,15};
        int c[]=new int[3];
        c[0]=1;
        c[1]=50;
        c[2]=25;
        System.out.println(c[2]);
        System.out.println(a.length);
       // System.out.println(b[-1]);

        String[] str={"abc","Def","GHI"};
        System.out.println(str.length);

        Boolean[] is_avail={true,false};
        System.out.println(is_avail.length);
        System.out.println(is_avail[0]);
    }
}

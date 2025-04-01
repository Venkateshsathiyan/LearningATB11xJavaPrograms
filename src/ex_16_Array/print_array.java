package ex_16_Array;

import java.util.Arrays;

public class print_array {
    public static void main(String[] args) {
        int a[]={1,8,6,45,25};
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println("After sorting");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

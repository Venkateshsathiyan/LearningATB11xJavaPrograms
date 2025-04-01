package ex_16_Array;

public class min_max_array {
    public static void main(String[] args) {
        int[] array = {25,56, 15, 36, 56, 77, 18, 29, 49,10};
       for (int i=0;i<array.length;i++)
       {
           if(array[i]<array[0])
           {
               array[0]=array[i];
           }
       }
        System.out.println("min="+array[0]);
        for (int j=array.length-1;j>=0;j--)
        {
            if(array[j]>array[0])
            {
                array[0]=array[j];
            }
        }
        System.out.println("max="+array[0]);
    }
}

package Daywise_task;

public class Odd_even_array {
    public static void main(String[] args) {
        int a[]={50,85,45,20,19,12};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]+" is even");
            }
            else
            {
                System.out.println(a[i]+" is odd");
            }
        }
    }
}

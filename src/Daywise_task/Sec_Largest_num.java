package Daywise_task;

public class Sec_Largest_num {
    public static void main(String[] args) {
        int a[]={1,52,763,45,15,10};

        for (int i=0;i<a.length;i++)
        {
            if(a[0]<a[i])
            {
                a[0]=a[i];
            }
        }
        System.out.println(a[2]);
    }
}

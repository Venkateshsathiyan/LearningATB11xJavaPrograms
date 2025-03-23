package Daywise_task;

public class Palindrome_num {
    public static void main(String[] args) {
        int num=123, rev=0,  rem;
        int temp=num;
        for (int i=1;i<=3;i++)
            if (num>0)
            {
                rem=num%10;
                rev=(rev*10)+rem;
                num=num/10;
            }
        System.out.println("Reverse="+rev);
        if(rev==temp)
            System.out.println("palindrome");
        else {
            System.out.println("Not palindrome");
        }
    }
}

package Daywise_task;

public class fizzbuzz {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++)
        {
          //  System.out.println(i);
            if((i%3==0) && (i%5==0))
            {
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

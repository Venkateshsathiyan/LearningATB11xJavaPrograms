package ex_13_Functions;

public class fns_IQ {
   static int c;
    public static int main(int a)
    {
         return 10;
    }
    public static float main(float a)
    {
        return 10f;
    }
    public static char main(char a)
    {
        return a;
    }
    public static boolean main(boolean a)
    {
        return true;
    }
    public static void main(String[] args) {
         int b= main(5);
                 System.out.println(b);
                 char c=main('v');
        System.out.println(c);
        float f= main(3.14f);
        System.out.println(f);
        Boolean bln=main(false);
        System.out.println(bln);
    }
}

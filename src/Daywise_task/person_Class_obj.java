package Daywise_task;

public class person_Class_obj {
    String name="Venkatesh";
    int Roll_no=1543724;
    int age=25;
    String addr="Big Street";
    Long phone=9517538521l;
    int sal=50000;
    int weight=50;
    float height=5.3f;
    boolean ismarried;
    boolean ismale;

    void sleep()
    {
        System.out.println("I'm sleeping");
    }
    boolean ismale(boolean male)
    {
        this.ismale=male;
        return ismale;
    }
    Void walk(String walk)
    {
        String Iwalk=walk;
        System.out.println(Iwalk);
        return null;
    }
    String work()
    {
        String Iwork="He is working";
        return Iwork;
    }

    public static void main(String[] args) {
        person_Class_obj pco=new person_Class_obj();
        boolean ismale1 = pco.ismale(true);
        System.out.println(ismale1);
        pco.sleep();
        String work1=pco.work();
        System.out.println(work1);
        pco.walk("He is walking");

    }
}

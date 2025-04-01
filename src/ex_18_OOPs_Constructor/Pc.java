package ex_18_OOPs_Constructor;

public class Pc {
    String car_type;
    int num;
    String registration;
    Pc() //DC
    {
        car_type="Electric";
        num=1234;
        registration="TN";
        System.out.println(car_type);
        System.out.println(num);
        System.out.println(registration);
    }
    Pc(String car_type, int num, String registration)
    {
        this.car_type=car_type;
        this.num=num;
        this.registration=registration;
    }

    public static void main(String[] args) {
        Pc p=new Pc();
        Pc p1=new Pc("Diesel",4563,"Chennai");
        System.out.println(p1.car_type+"\t"+p1.num+"\t"+p1.registration);
    }
}

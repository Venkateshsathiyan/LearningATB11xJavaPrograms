package ex_18_OOPs_Constructor;

public class CO {
    String car_type;
    int num;
    String registration;
    Boolean gear;
    String Horn;

    CO(String car_type, int num, String registration) {
        this.car_type = car_type;
        this.num = num;
        this.registration = registration;
    }
    CO(Boolean gear, String Horn) {
       this.gear=gear;
        System.out.println("Gear="+gear);
       this.Horn="Sound Horn";
        System.out.println("Horn="+Horn);
    }

    public static void main(String[] args) {
        CO C1= new CO("Manual", 7952,"Kumbakonam");
        System.out.println(C1.car_type);
        CO C2= new CO(true,"music");

    }
}

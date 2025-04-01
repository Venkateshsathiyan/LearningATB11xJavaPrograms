package ex_18_OOPs_Constructor;

public class DC {
    String name;
    String address;
    byte age;
    DC()
    {
        name="Venkatesh";
        address="Big Street";
        age=26;
    }

    public static void main(String[] args) {
        DC D= new DC();
        System.out.println(D.name);
        System.out.println(D.age);
        System.out.println(D.address);
    }
}

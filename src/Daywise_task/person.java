package Daywise_task;

public class person {
    String name;
    int age;
    String address;
    Long phone;
    Boolean ismale;
    person()
    {
        this.name="Venkatesh";
        this.age=27;
        this.address="Big street";
        this.phone=95348516215l;
        this.ismale=true;
    }
    person(String name, int age, String addr, Long phone, Boolean ismale)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
        this.ismale=ismale;
    }
    public void eat()
    {
        System.out.println(this.name+"is eathing");
    }
    public void walk()
    {
        System.out.println(this.name+"will go walking around 5");
    }
    public void doHome()
    {
        System.out.println(this.name+"is working in general shift");
    }
    public void sleep()
    {
        System.out.println(this.name+"is sleep around 10");
    }


    public static void main(String[] args) {
        person P1=new person();
        System.out.println(P1.name+"\t"+P1.age+"\t"+P1.address+"\t"+P1.phone+"\t"+P1.ismale);
        P1.eat();
        P1.walk();
        P1.sleep();
        P1.doHome();
        person P2=new person("Kokila",50,"Chariot street",9535462515l,false);
        System.out.println(P2.name+"\t"+P2.age+"\t"+P2.address+"\t"+P2.phone+"\t"+P2.ismale);
    }
}

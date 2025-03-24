package ex_14_Strings;

public class String_creation_immutable {
    public static void main(String[] args) {

        // string creation
        String name="Venkatesh"; // stored string constant pool in JVM
        String n1= new String("Sathiyan"); //stored in Heap area in JVM
        String n3= new String("Sathiyan"); //we can create n no. of obj in head area
        String n4= new String("Sathiyan");

        //why string is immutable:
        System.out.println("Name="+name);
        name=name.concat("Kokila");
        System.out.println("Name="+name); //In SCP it contains both venkatesh and venkateshkokila but reference variable point/assigned to venkateshkokila. so it is immutable.

        //ex2:
        String n2=name.concat(" Abi");
        System.out.println("Name="+name);
        System.out.println("N2="+n2);

    }
}

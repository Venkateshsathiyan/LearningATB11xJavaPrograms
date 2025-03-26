package ex_14_Strings;

public class StrinBuffer_Builder_Methods {
    public static void main(String[] args) {
        StringBuilder s1= new StringBuilder("Venkatesh");
        System.out.println(s1.length());
        System.out.println(s1.append(" Sathiyan"));
        //insert-start pos:0
        System.out.println(s1.insert(9,'a'));
        //replace-
        System.out.println(s1.replace(0,9,"Kokila"));
        //Delete:
        System.out.println(s1.delete(0,6));
        //delete charAt:
        System.out.println(s1.deleteCharAt(6));
        //reverse:
       System.out.println(s1.reverse());
        //capacity
        System.out.println(s1.capacity());
        //substring
        System.out.println(s1.substring(6,9));
    }
}

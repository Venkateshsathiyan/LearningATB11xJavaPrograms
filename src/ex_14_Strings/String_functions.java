package ex_14_Strings;

public class String_functions {
    public static void main(String[] args) {
        String n="Venkatesh";
        System.out.println(n.length());
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());
        System.out.println(n.concat(" M S")); //concat

        //Contains: true or false
        System.out.println(n.contains("esh"));
        //equals: true or false
        System.out.println(n.equals("Venkatesh"));
        System.out.println(n.equals("venkatesh"));
        //Equalignore: true or false
        System.out.println(n.equalsIgnoreCase("venkatesh"));
        System.out.println(n.equalsIgnoreCase("Venkatesh"));
        //index of: return teh first index position start from 0
        System.out.println(n.indexOf('e'));
        //last index of
        System.out.println(n.lastIndexOf('e'));
        //replace:
        System.out.println(n.replace('e','a'));
        System.out.println(n.replace("Venkatesh","Sathiyan"));
        //Split:
        String str="Venkatesh@gmail@sathiyan.com";
        String[] str1=str.split("@");
        System.out.println("Str1="+str1[0]);
        System.out.println("Str1="+str1[1]);
        System.out.println("Str1="+str1[2]);
        //Starts-with: Return boolean
        System.out.println(str.startsWith("V"));
        System.out.println(n.startsWith("s"));
        //Ends with: return boolean

        System.out.println(str.endsWith("s"));
        System.out.println(n.endsWith("h"));
        //Trim:
        String s="     Kokila     ";
        System.out.println(s.trim());
        //compare to: return 0 and 1
        System.out.println(s.compareTo("     Kokila     "));
// compareignore case:
        System.out.println(s.compareToIgnoreCase("     Kokila     "));
        //substring:
        String d="Dhivya";
        System.out.println(d.substring(2,6));

        //String Builder;
        StringBuilder v = new StringBuilder("Venkatesh sathiyan");
        System.out.println(v);
        System.out.println(v.toString());// both doing same functions
        System.out.println(v.reverse()); //it reverse and assign it to variable
        System.out.println(v.append(" kokila"));
    }
}

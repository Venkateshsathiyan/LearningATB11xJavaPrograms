package Daywise_task;

import java.util.Scanner;

public class vowels_consonants {
    public static void main(String[] args) {
       // String name="venkatesh";
        String name="Venkatesh";
        int count=0,C_count=0;
        char ch;
        for (int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
                System.out.println("Vowel ch="+ch);
            }
            else
            {
                C_count++;
                System.out.println("Consonant ch="+ch);
            }
            //System.out.println(ch);
        }
                 System.out.println("Vowel="+count);
        System.out.println("Consonant="+C_count++);

    }
}

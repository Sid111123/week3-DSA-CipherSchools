import java.util.*;

class Lecture28
{
    public static void main(String ar[])
    {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Good morning"); // operates compares references for objects and values for primitave data types
        String s4 = new String("Good morning");

        System.out.println(s1==s2);
        System.out.println(s3==s4);

        // Concatenation

        String s5 = s1 + s2;
        String s6 = new String("John");
        String s7 = new String("Wick");
        String s8 = s6.concat(s7);

        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        
    }
}
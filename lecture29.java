import java.util.*;

class Lecture29
{
    public static void main(String ar[])
    {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Good morning"); // operates compares references for objects and values for primitave data types
        String s4 = new String("Good morning");

        //System.out.println(s1==s2);
        //System.out.println(s3==s4);

       char arr[] = {'A','B','C','D','E','F','G'};

       System.out.println(s3.equals(s4));
       String s5 = new String(arr);
       System.out.println(s5);
        
    }
}
import java.util.*;

class Lecture32
{
    public static void main(String ar[])
    {
        String s = "Hello WORLD";
        String s1 = "Good";
        System.out.println(s.compareTo(s1));


        String s3 = new String("         Hello");
        String s4 = new String("Hello         ");
        String s5 = new String("He    llo");

        System.out.println(s3.trim());
        System.out.println(s4.trim());
        System.out.println(s5.trim());

        System.out.println(s.replace("o","@"));


    }
}
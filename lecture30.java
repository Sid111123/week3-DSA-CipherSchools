import java.util.*;

class Lecture30
{
    public static void main(String ar[])
    {
        String s1 = "Hello";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

       char arr[] = {'A','B','C','D','E','F','G'};

       String s2 = new String(arr,1,4);
       String s3 = new String(arr,2,3);
       String s4 = new String(arr,1,6);

       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);

       String s5 = "Good Morning to EveryOne";
       String stringarr [] = s5.split(" ");
       System.out.println("Elements in the array........");
       for(String s : stringarr)
       {
            System.out.println(s);
       }
        
    }
}
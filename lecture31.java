import java.util.*;

class Lecture31
{
    public static void main(String ar[])
    {
       String s1 = "Good Morning to EveryOne";
       String stringarr [] = s1.split(" ");
       System.out.println("Elements in the array........");
       for(String s : stringarr)
       {
            System.out.println(s);
       }

       int a = s1.indexOf('o'); // return the index where the character present
       int b = s1.indexOf('o',5); // start searching char o from index 5 including 5
       int c = s1.indexOf('k'); // returns -1 if the chracter isn't present

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);

       int d = s1.indexOf('o');
       while(d != -1)
       {
            System.out.println(d);
            d = s1.indexOf('o',d+1);
       }
       
        
    }
}
import java.util.*;

class Lecture40
{
    public static boolean rotatedString(String s1, String s2)
    {
        if(s1.length()!=s2.length()) return false;
        s1 = s1 + s1;
        if(s1.contains(s2)) return true;
        else return false;
    }
    public static void main(String ar[])
    {
        String s1 = "geeksforngeeks";
        String s2 = "forgeeksgeeks";

        if(rotatedString(s1,s2))
        {
            System.out.println("The Strings are Rotated");
        }
        else System.out.println("The Strings are Not Rotated");
    }
}

/*

//  using substring methos to find whether the string is rotated or not.

    public static boolean rotatedString(String s1, String s2)
    {
        if(s1.length() != s2.length()) return false;

        for(int i=0;i<s1.length();i++)
        {
            s1 = s1.substring(1) + s1.substring(0,1);
            if(s1.equals(s2)) return true;
        }
        return false;
    }
    public static void main(String ar[])
    {
        String s1 = "geeksforngeeks";
        String s2 = "forgeeksgeeks";

        if(rotatedString(s1,s2))
        {
            System.out.println("The Strings are Rotated");
        }
        else System.out.println("The Strings are Not Rotated");
    }

*/